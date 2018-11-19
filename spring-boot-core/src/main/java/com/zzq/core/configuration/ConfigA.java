package com.zzq.core.configuration;

import com.zzq.core.service.Car;
import com.zzq.core.service.impl.Toyota;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean("toyota")
    public Car getToyota() {
        return new Toyota();
    }
}
