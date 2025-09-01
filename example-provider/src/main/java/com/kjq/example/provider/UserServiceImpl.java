package com.kjq.example.provider;

import com.kjq.example.common.model.User;
import com.kjq.example.common.service.UserService;
import lombok.extern.slf4j.Slf4j;


/**
 * 用户服务实现类
 */
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        log.info("服务提供者被调用--------》用户名：{}", user.getName());
        return user;
    }

}
