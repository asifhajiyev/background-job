package com.example.backgroundjob.controller;

import com.example.backgroundjob.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{id}")
    public String getCustomer(@PathVariable String id) {
        customerService.getCustomer(id);
        return "OK";
    }
}
