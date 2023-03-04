package com.feidian.system.service.impl;

import com.feidian.common.core.domain.entity.SysUser;
import com.feidian.system.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public SysUser selectUserByUserName(String userName) {
        return null;
    }
}
