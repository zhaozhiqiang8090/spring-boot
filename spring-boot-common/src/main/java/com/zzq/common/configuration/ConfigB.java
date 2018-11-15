package com.zzq.common.configuration;

import com.zzq.common.service.Car;
import com.zzq.common.service.impl.BMW;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {

    @Bean("bmw")
    public Car getBmw() {
        return new BMW();
    }
}
