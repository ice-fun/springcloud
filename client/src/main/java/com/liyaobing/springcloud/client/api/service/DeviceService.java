package com.liyaobing.springcloud.client.api.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liyaobing.springcloud.bean.device.Device;
import com.liyaobing.springcloud.client.api.mapper.DeviceMapper;
import org.springframework.stereotype.Service;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/8/7
 **/

@Service
public class DeviceService extends ServiceImpl<DeviceMapper, Device> {
}
