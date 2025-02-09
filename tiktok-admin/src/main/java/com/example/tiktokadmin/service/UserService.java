package com.example.tiktokadmin.service;

import com.example.tiktokadmin.common.result.PageResult;
import com.example.tiktokadmin.pojo.dto.UserPageQueryDTO;
import com.example.tiktokadmin.pojo.entity.User;

public interface UserService {
    /**
     * 分页查询
     * @param userPageQueryDTO
     * @return
     */
    PageResult pageQuery(UserPageQueryDTO userPageQueryDTO);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getById(Long id);
}
