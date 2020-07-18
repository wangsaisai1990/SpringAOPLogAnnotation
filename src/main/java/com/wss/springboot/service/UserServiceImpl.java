package com.wss.springboot.service;

import com.wss.springboot.annotation.OperationLogDetail;
import com.wss.springboot.enums.OperationType;
import com.wss.springboot.enums.OperationUnit;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 *
 * @author wss
 * @date 2018/9/13
 */
@Service
public class UserServiceImpl implements UserService {

    @OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        return "zhangsan";
    }
}