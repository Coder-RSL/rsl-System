package com.feidian.system.service;

import com.feidian.common.core.domain.entity.SysUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public SysUser selectUserByUserName(String userName);
}
