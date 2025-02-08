package com.example.tiktokadmin.service;

import com.example.tiktokadmin.common.result.PageResult;
import com.example.tiktokadmin.pojo.dto.UserPageQueryDTO;

public interface UserService {
    PageResult pageQuery(UserPageQueryDTO userPageQueryDTO);
}
