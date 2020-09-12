package com.liyaobing.springcloud.feign.config;

import com.sun.net.httpserver.Authenticator;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.retry.Retry;

import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/9/1
 **/

@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetry(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
