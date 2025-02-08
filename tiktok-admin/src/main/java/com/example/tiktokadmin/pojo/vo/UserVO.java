package com.example.tiktokadmin.pojo.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserVO implements Serializable {
    private String UserName;
    private String password;
}
