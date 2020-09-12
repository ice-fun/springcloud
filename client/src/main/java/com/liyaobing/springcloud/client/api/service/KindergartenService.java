package com.liyaobing.springcloud.client.api.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liyaobing.springcloud.bean.kindergarten.po.Kindergarten;
import com.liyaobing.springcloud.client.api.mapper.KindergartenMapper;
import org.springframework.stereotype.Service;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/8/7
 **/

@Service
public class KindergartenService extends ServiceImpl<KindergartenMapper, Kindergarten> {
}
