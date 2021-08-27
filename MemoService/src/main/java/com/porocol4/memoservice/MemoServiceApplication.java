package com.porocol4.memoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoServiceApplication.class, args);
    }

}
