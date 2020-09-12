package com.liyaobing.springcloud.feign.api.mapper;

import com.liyaobing.springcloud.bean.common.BaseResponse;
import com.liyaobing.springcloud.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/9/1
 **/

@FeignClient(value = "cloud-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @PostMapping("/cloud/kindergarten/kindergarten/list")
    BaseResponse sayHi();
}
