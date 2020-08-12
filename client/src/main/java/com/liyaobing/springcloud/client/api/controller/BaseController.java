package com.liyaobing.springcloud.client.api.controller;

import com.liyaobing.springcloud.client.api.service.DeviceService;

import javax.annotation.Resource;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/8/7
 **/


public abstract class BaseController {

    @Resource
    DeviceService deviceService;
}
