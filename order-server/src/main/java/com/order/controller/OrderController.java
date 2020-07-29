package com.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author anxiuze
 * @date 2020/7/29 14:54
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    //private static final String REST_URL_PREFIX = "http://localhost:8002";
    private static final String REST_URL_PREFIX = "http://STOCK-SERVER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        log.info("order add begin");
        String result = restTemplate.getForObject(REST_URL_PREFIX + "/stock/add", String.class);
        return result;
    }

}
