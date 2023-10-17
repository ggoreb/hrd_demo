package com.example.demo.config;

import java.util.Calendar;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Game;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@ImportResource("classpath:app2.xml")
public class BeanConfig {
  @Bean
  public Game game() {
    return new Game();
  }

  @Bean
  public String bean1() {
    return new String("Bean 1");
  }
  @Bean
  public Random bean2() {
    return new Random();
  }
  @Bean
  public Calendar bean3() {
    return Calendar.getInstance();
  }
}
