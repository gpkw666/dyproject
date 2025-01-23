package com.example.tiktokuser.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务测试接口（确保服务可用后可删除）
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/test")
    public String test() {
        System.out.println("我被调用了");
        return "hello world";
    }
}
