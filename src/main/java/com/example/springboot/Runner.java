package com.example.springboot;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Log4j2
@Profile("dev")
public class Runner {

  @Bean
  org.springframework.boot.ApplicationRunner applicationRunner(Environment environment) {
    return args -> log.info("message from application.properties " + environment.getProperty("message"));
  }
}
