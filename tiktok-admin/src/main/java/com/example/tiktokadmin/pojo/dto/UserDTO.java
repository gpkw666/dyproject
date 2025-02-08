package com.example.tiktokadmin.pojo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

    private String UserName;
    private String password;
}
