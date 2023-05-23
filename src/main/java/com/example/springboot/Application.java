package com.example.springboot;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    new SpringApplicationBuilder()
            .profiles("test")
            .sources(Application.class)
            .run(args);
  }

  @Bean
  ApplicationRunner applicationRunner(Environment environment) {
    return args -> log.info("message from application.properties " + environment.getProperty("message"));
  }
}
