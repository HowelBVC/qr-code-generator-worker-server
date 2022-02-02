package com.check.spindle.qrcodegeneratorworkerserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
