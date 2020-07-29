package com.platform.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author anxiuze
 * @date 2020/7/29 14:50
 * @Description: 自定义配置类
 */
@Configuration
public class OrderConfig {

    @Bean
    @LoadBalanced //使用负载均衡
    public RestTemplate restTemplate(){
        System.out.println("config resttemplate.....");
        return new RestTemplate();
    }

}
