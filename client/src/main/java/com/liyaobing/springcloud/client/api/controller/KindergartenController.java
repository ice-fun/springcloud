package com.liyaobing.springcloud.client.api.controller;

import com.liyaobing.springcloud.bean.common.BaseResponse;
import com.liyaobing.springcloud.bean.kindergarten.po.Kindergarten;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/8/7
 **/

@RestController
@RequestMapping("/kindergarten/kindergarten/")
public class KindergartenController extends BaseController {

    @PostMapping("/list")
    public BaseResponse list() {
        List<Kindergarten> list = kindergartenService.list();
        return BaseResponse.createSuccessResponse(list);
    }
}
