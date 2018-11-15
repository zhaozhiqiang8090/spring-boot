package com.zzq.commontraining.configuration;

import com.zzq.commontraining.service.Car;
import com.zzq.commontraining.service.impl.Toyota;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean("toyota")
    public Car getToyota() {
        return new Toyota();
    }
}
