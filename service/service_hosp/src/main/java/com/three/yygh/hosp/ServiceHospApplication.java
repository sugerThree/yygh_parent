package com.three.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * componentScan->swagger2组件扫描的范围
 *
 * @author three
 * @date 2022-07-22 16:29
 */
@SpringBootApplication
@ComponentScan("com.three")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
