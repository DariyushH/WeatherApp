package com.example.weatherapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan
@EnableScheduling
public class SpringConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
