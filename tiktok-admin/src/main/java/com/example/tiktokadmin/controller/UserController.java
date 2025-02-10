package com.example.tiktokadmin.controller;

import com.example.tiktokadmin.common.exception.AdminLoginException;
import com.example.tiktokadmin.common.result.PageResult;
import com.example.tiktokadmin.common.result.Result;
import com.example.tiktokadmin.pojo.dto.UserDTO;
import com.example.tiktokadmin.pojo.dto.UserPageQueryDTO;
import com.example.tiktokadmin.pojo.entity.User;
import com.example.tiktokadmin.pojo.vo.UserVO;
import com.example.tiktokadmin.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息相关接口
 */
@RestController("UserController")
@Slf4j
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 管理员登录
     * 固定账户密码admin,admin暂时不做鉴权
     * @param userDTO
     * @return
     */
    @PostMapping("/login")
    public Result<UserVO> login(@RequestBody UserDTO userDTO){
         log.info("管理员登录：{}",userDTO);
         if(userDTO.getUserName().equals("admin")&&userDTO.getPassword().equals("admin")){
             UserVO userVO = UserVO.builder()
                     .UserName(userDTO.getUserName())
                     .password(userDTO.getPassword())
                     .build();
             return Result.success(userVO);
         }
         return Result.error(AdminLoginException.USER_NOT_EXIST);
    }

    /**
     * 用户分页查询
     * @param userPageQueryDTO
     * @return
     */
    @GetMapping("/page")
    public Result<PageResult> page(UserPageQueryDTO userPageQueryDTO)
    {
        log.info("员工分页查询，参数为：{}",userPageQueryDTO);
        PageResult pageResult = userService.pageQuery(userPageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Long id){
        log.info("根据id:{} 查询用户信息",id);
        User user = userService.getById(id);
        return Result.success(user);
    }
}
