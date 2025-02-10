package com.example.tiktokcommodity;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.tiktokcommodity.mapper")
class TiktokCommodityApplicationTests {



    @Test
    void contextLoads() {
        System.out.println("测试成功");
    }

}
