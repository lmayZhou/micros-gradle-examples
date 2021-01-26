package com.example.micros.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * --
 *
 * @author Lmay Zhou
 * @date 2021/1/25 11:50
 * @email lmay@lmaye.com
 */
@RefreshScope
@RestController
@RequestMapping
public class TestController {
    @Value("${logging.config}")
    private String logConfig;

    @GetMapping("/test")
    public String test() {
        return logConfig;
    }
}
