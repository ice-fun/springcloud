package com.liyaobing.springcloud.feign.api.controller;

import com.liyaobing.springcloud.bean.common.BaseResponse;
import com.liyaobing.springcloud.feign.api.service.EurekaClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/9/1
 **/

@RestController
public class MomentController {
    @Resource
    EurekaClientService eurekaClientService;

    @PostMapping("/hi")
    public BaseResponse sayHi(){
        return eurekaClientService.hiService();
    }

}
