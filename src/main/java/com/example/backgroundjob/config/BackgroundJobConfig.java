package com.example.backgroundjob.config;

import org.jobrunr.jobs.mappers.JobMapper;
import org.springframework.context.annotation.Bean;
import org.jobrunr.storage.InMemoryStorageProvider;
import org.jobrunr.storage.StorageProvider;
import org.springframework.stereotype.Component;

@Component
public class BackgroundJobConfig {
    @Bean
    public StorageProvider storageProvider(JobMapper jobMapper) {
        InMemoryStorageProvider storageProvider = new InMemoryStorageProvider();
        storageProvider.setJobMapper(jobMapper);
        return storageProvider;
    }
}
