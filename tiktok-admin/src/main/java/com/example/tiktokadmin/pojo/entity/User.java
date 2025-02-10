package com.example.tiktokadmin.pojo.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户实体类
 */
@Data
@Builder
public class User {
    private Long id;
    private String avatar;
    private String  userName;
    private String password;
    private LocalDateTime createTime;
}
