package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign
 * User: dark xue
 * Date: 2017/7/8
 * Time: 15:34
 * description:
 */
@FeignClient("hello-service/demo")
public interface HelloService {
    @RequestMapping("/index")
    String index();
}
