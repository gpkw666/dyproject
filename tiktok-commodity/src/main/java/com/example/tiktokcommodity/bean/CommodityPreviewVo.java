package com.example.tiktokcommodity.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
public class CommodityPreviewVo {
    private Long id;
    private String name;
    private BigDecimal price;
    private String image;
}
