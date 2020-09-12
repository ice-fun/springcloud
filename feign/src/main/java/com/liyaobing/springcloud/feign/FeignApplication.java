package com.liyaobing.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/9/1
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class);
    }
}
