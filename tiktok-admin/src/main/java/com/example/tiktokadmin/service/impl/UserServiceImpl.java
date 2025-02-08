package com.example.tiktokadmin.service.impl;


import com.example.tiktokadmin.common.result.PageResult;
import com.example.tiktokadmin.mapper.UserMapper;
import com.example.tiktokadmin.pojo.dto.UserPageQueryDTO;
import com.example.tiktokadmin.pojo.entity.User;
import com.example.tiktokadmin.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  后台管理用户信息的相关方法
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    /**
     * 用户信息分页查询
     * @param userPageQueryDTO
     * @return
     */
    @Override
    public PageResult pageQuery(UserPageQueryDTO userPageQueryDTO) {
        //开始分页查询
        PageHelper.startPage(userPageQueryDTO.getPage(),userPageQueryDTO.getPageSize());

        Page<User> page = userMapper.pageQuery(userPageQueryDTO);
        //对page进行处理，处理成result类型对象再返回
        long total=page.getTotal();
        List<User> records = page.getResult();

        return new PageResult(total,records);
    }
}
