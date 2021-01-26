package com.lmaye.micros.service.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * -- User Service Config
 *
 * @author Lmay Zhou
 * @date 2021/1/25 16:42
 * @email lmay@lmaye.com
 */
@MapperScan(basePackages = "com.lmaye.micros.service.user.repository")
@Configuration
public class UserServiceConfig {
}
