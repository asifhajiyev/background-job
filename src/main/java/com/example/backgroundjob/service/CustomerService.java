package com.example.backgroundjob.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final JobService jobService;

    public CustomerService(JobService jobService) {
        this.jobService = jobService;
    }

    public void getCustomer(String id){
        jobService.getCustomerWithJobRunr(id);
    }
}
