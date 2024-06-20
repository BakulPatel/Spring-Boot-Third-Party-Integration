package com.bakul.config;


import com.bakul.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

}
