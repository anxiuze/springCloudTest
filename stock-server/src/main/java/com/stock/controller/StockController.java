package com.stock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anxiuze
 * @date 2020/7/29 15:07
 * @Description:
 */
@RestController
@RequestMapping("/stock")
@Slf4j
public class StockController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        log.info("add stock success");
        return "add one stock";
    }

}
