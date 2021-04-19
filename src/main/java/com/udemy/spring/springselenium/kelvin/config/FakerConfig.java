package com.udemy.spring.springselenium.kelvin.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;

public class FakerConfig {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}
