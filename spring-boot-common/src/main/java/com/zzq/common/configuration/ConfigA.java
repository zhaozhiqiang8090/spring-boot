package com.zzq.common.configuration;

import com.zzq.common.service.Car;
import com.zzq.common.service.impl.Toyota;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean("toyota")
    public Car getToyota() {
        return new Toyota();
    }
}
