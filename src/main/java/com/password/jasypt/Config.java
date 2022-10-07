package com.password.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {
    @Value("${spring.test.password}")
    public String password;

    @Bean
    public String getValue(){
        System.err.println(password);
        return password;
    }
}
