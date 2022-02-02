package com.check.spindle.qrcodegeneratorworkerserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class Controller {
    @Autowired
    private CustomerRepository repository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId) {
        return repository.getById(customerId);
    }
}
