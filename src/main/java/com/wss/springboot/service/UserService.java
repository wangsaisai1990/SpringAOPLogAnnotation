package com.wss.springboot.service;

/**
 * Created by IntelliJ IDEA
 *
 * @author wss
 * @date 2018/9/13
 */
public interface UserService {

    /**
     * 获取用户信息
     * @return
     * @param tel
     */
    String findUserName(String tel);
}