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
public class addCommodity {

    //不能为空
    @NotEmpty(message = "商品名称不能为空")
    private String name;

    //不能为空
    @NotNull(message = "分类ID不能为空")
    private Long categoryId;

    //不能为空
    @NotNull(message = "价格不能为空")
    private BigDecimal price;

    private String image;

    private String description;

    private Integer status;

    //不能为空
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @NotNull(message = "创建时间不能为空")
    private Date createTime;

    //不能为空
    @NotNull(message = "创建用户不能为空")
    private Long createUser;

}
