package org.baeldung;

import java.util.List;

import org.json.JSONArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
    
    @Bean
    public Converter<List<String>, String> converter() {
      return new Converter<List<String>, String>() {
        public String convert(List<String> source) {
          return new JSONArray(source).toString();
        }
      };
    }

}