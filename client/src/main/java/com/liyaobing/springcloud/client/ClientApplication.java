package com.liyaobing.springcloud.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/8/6
 **/

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.liyaobing.springcloud.client.api.mapper")
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
