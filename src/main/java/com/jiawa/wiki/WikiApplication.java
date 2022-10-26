package com.jiawa.wiki;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.jiawa")
public class WikiApplication {
  public static void main(String[] args) {
      SpringApplication app = new SpringApplication(WikiApplication.class);
      app.run();
  }
}
