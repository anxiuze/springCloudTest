package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author anxiuze
 * @date 2020/7/29 10:17
 * @Description:
 */


@SpringBootApplication
@ComponentScan(basePackages = {"com.order","com.platform"})
@EnableEurekaClient
@EnableDiscoveryClient
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args);
    }
}
