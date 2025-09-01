package com.kjq.example.common.service;

import com.kjq.example.common.model.User;

public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * 测试模拟数据，获取数字
     *
     * @return
     */
    default short getNumber() {
        return 1;
    }

}
