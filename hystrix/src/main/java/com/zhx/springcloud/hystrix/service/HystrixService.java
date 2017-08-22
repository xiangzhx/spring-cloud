package com.zhx.springcloud.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 依赖服务
 * Author: zhangx
 * Date: 2017/8/21.
 */
@Service
public class HystrixService {

    @Autowired
    private CallDependencyService dependencyService;

    public String callDependencyService() {
        return dependencyService.mockGetUserInfo();
    }
}
