package com.baond.easybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*In Spring Security, @EnableWebSecurity is required to enable security configurations manually.
However, in Spring Boot, security is auto-configured, so we don't need to explicitly add this annotation
unless we want to customize security settings*/
/*@EnableWebSecurity*/
/*@EnableJpaRepositories("com.baond.easybank.repository")
@EntityScan("com.baond.easybank.model")*/
public class EasybankApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasybankApplication.class, args);
    }

}
