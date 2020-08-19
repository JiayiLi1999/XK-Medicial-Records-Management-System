package com.sufer.service;

import com.sufer.pojo.User;

/**
 * @author danger
 * @date 2020/6/1 - 14:08
 */


public interface UserService {
    User selectPasswordByName(String userName, String password);
    User selectPasswordByEmail(String userEmail, String password);
    User selectUserById(Integer userId);

    int updatePassword(String userEmail,String newPassword);

    int addUser(User user);
}
