package com.daka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Date: 2019/07/18
 * Time: 下午20:39
 *
 * @author manqs
 */

@EnableEurekaServer
@SpringBootApplication
public class ApplicationEntry {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEntry.class, args);
    }
}