package com.liyaobing.springcloud.feign.api.service;

import com.liyaobing.springcloud.bean.common.BaseResponse;
import com.liyaobing.springcloud.feign.api.mapper.EurekaClientFeign;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/9/1
 **/


@Service
public class EurekaClientService {
    @Resource
    EurekaClientFeign eurekaClientFeign;

    public BaseResponse hiService(){
        return eurekaClientFeign.sayHi();
    }
}
