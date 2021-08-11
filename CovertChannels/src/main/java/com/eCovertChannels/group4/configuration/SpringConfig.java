package com.eCovertChannels.group4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eCovertChannels.group.services.DataServices;

@Configuration 
public class SpringConfig { 

@Bean
public DataServices dataService() {
    return new DataServices();
}

}