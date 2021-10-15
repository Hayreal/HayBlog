package com.hayreal.hayblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan(value = "com.hayreal.**.mapper")
public class HayBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(HayBlogApplication.class, args);
    }
}
