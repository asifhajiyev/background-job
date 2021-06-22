package com.example.backgroundjob.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CustomerRepository {

    public void getCustomer(String id) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException interruptedException) {
            log.error(interruptedException.getMessage());
        }
        log.info(id);
    }
}
