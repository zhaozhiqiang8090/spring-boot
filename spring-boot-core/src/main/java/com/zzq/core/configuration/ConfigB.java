package com.zzq.core.configuration;

import com.zzq.core.service.Car;
import com.zzq.core.service.impl.BMW;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {

    @Bean("bmw")
    public Car getBmw() {
        return new BMW();
    }
}
