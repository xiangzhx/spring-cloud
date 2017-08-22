package com.zhx.springcloud.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * 调用依赖服务，通过hystrix包装调用服务
 * Author: zhangx
 * Date: 2017/8/21.
 */
@Component
public class CallDependencyService {
    private Random random = new Random();

    /**
     * 模拟获取用户信息
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String mockGetUserInfo() {
        int randomInt = random.nextInt(10);
        if (randomInt < 8) {
            throw new RuntimeException("call dependency service fail.");
        } else {
            return "UserName：zhangxiang:number" + randomInt;
        }
    }

    public String fallback() {
        return "some exception occur call fallback method.";
    }
}
