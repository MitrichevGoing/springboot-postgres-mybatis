package com.potter.postgres;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "classpath:/mapper/*")
@SpringBootApplication(scanBasePackages = "com.potter.postgres.*")
public class SpringbootPostgresDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootPostgresDemoApplication.class, args);
  }

}
