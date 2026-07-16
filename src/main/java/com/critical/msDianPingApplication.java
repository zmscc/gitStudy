package com.critical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.critical.mapper")
@SpringBootApplication
public class msDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(msDianPingApplication.class, args);
    }

}
