FROM gradle:7.3.3-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:11-jre-slim
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/application.jar
RUN cd /app && ls

ENTRYPOINT ["java","-jar","/app/application.jar"]