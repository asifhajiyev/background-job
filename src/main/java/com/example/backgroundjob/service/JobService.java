package com.example.backgroundjob.service;

import com.example.backgroundjob.repository.CustomerRepository;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final JobScheduler jobScheduler;
    private final CustomerRepository customerRepository;


    public JobService(JobScheduler jobScheduler, CustomerRepository customerRepository) {
        this.jobScheduler = jobScheduler;
        this.customerRepository = customerRepository;
    }

    public void getCustomerWithJobRunr(String id){
        jobScheduler.enqueue(() -> customerRepository.getCustomer(id));
    }

    public void getCustomer(String id){
        customerRepository.getCustomer(id);
    }
}
