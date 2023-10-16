package com.springdatajpa.practice.config;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}
}
