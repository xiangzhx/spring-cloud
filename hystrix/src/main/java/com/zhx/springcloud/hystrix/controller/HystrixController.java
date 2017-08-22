package com.zhx.springcloud.hystrix.controller;

import com.zhx.springcloud.hystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhangx
 * Date: 2017/8/21.
 */
@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    /**
     * 调用依赖服务
     * @return
     */
    @RequestMapping("/call")
    public String callDependencyService(){
        return hystrixService.callDependencyService();
    }

}
