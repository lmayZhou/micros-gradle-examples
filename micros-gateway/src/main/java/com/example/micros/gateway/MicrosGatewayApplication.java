package com.example.micros.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * -- Gateway Application
 *
 * @author Lmay Zhou
 * @date 2021/1/22 16:23
 * @email lmay@lmaye.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicrosGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicrosGatewayApplication.class, args);
    }
}
