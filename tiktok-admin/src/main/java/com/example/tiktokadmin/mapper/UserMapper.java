package com.example.tiktokadmin.mapper;

import com.example.tiktokadmin.pojo.dto.UserPageQueryDTO;
import com.example.tiktokadmin.pojo.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 分页查询
     * @param userPageQueryDTO
     * @return
     */
    Page<User> pageQuery(UserPageQueryDTO userPageQueryDTO);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getById(Long id);
}
