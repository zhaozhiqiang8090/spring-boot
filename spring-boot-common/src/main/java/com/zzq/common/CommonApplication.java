package com.zzq.common;

import com.zzq.common.filter.TestFilter;
import com.zzq.common.listener.TestListener;
import com.zzq.common.servlet.TestServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

import java.util.Arrays;

@SpringBootApplication
@EnableRetry
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean<TestServlet> testServlet() {
        return new ServletRegistrationBean<>(new TestServlet(), "/testServlet");
    }

    @Bean
    public FilterRegistrationBean testFilter() {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TestFilter());
        frb.setUrlPatterns(Arrays.asList("/hello/test"));
        return frb;
    }

    @Bean
    public ServletListenerRegistrationBean testListener() {
        return new ServletListenerRegistrationBean<>(new TestListener());
    }

}
