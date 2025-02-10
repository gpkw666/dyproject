package com.example.tiktokcommodity.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Component
public class Commodity {

    @NotNull
    private Long id;

    private String name;

    private Category category;

    private BigDecimal price;

    private String image;

    private String description;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private Long createUser;

    private Long updateUser;

}
