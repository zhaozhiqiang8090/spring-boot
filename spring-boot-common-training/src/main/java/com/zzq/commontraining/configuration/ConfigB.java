package com.zzq.commontraining.configuration;

import com.zzq.commontraining.service.Car;
import com.zzq.commontraining.service.impl.BMW;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {

    @Bean("bmw")
    public Car getBmw() {
        return new BMW();
    }
}
