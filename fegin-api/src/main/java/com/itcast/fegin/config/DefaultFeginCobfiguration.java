package com.itcast.fegin.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultFeginCobfiguration {

    @Bean
    public Logger.Level logelLevel(){
        return Logger.Level.BASIC;
    }

}
