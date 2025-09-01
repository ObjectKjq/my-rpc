package com.kjq.example.common;

import com.kjq.example.common.service.UserService;
import com.kjq.example.provider.UserServiceImpl;

public class Test01 {
    public static void main(String[] args) {
        // System.out.println(UserService.class.getName());
        // UserServiceImpl userService = new UserServiceImpl();
        System.out.println(UserServiceImpl.class.getClassLoader());
    }

}
