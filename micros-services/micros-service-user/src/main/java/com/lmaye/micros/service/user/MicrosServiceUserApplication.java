package com.lmaye.micros.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * -- Micros Service User Application
 *
 * @author Lmay Zhou
 * @date 2021/1/22 16:23
 * @email lmay@lmaye.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicrosServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicrosServiceUserApplication.class, args);
    }
}
