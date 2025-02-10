package com.example.tiktokcommodity.controller;


import com.example.tiktokcommodity.Result.Result;
import com.example.tiktokcommodity.bean.Commodity;
import com.example.tiktokcommodity.bean.CommodityPreviewVo;
import com.example.tiktokcommodity.bean.addCommodity;
import com.example.tiktokcommodity.service.impl.testService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品服务相关接口
 */
@Slf4j
@RestController
public class CommodityController {

    @Autowired
    private testService testService;

    //根据ID获取完整商品信息
    @GetMapping(value = "/commodity/{id}")
    public Result getCommodityById(@PathVariable Long id) {
        Commodity commodity = testService.getCommodityById(id);
        return Result.success(commodity);
    }

    //根据ID获取商品预览信息
    @GetMapping(value = "/commodityvo/{id}")
    public Result getCommodityPreviewVo(@PathVariable Long id) {
        CommodityPreviewVo commodity = testService.getCommodityPreviewVoById(id);
        return Result.success(commodity);
    }

    //获取最新商品预览信息，参数为获取数量
    @GetMapping(value = "/latestcommodityvo/{amount}")
    public Result getLatestCommodityPreviewVos(@PathVariable Long amount) {
        List<CommodityPreviewVo> commodities = testService.getLatestCommodityPreviewVos(amount);
        return Result.success(commodities);
    }

    //添加商品
    @PostMapping(value = "/commodity")
    public Result addCommodity(@RequestBody @Valid addCommodity addCommodity) {
        testService.addCommodity(addCommodity);
        return Result.success();
    }

    //更新商品
    @PutMapping(value = "/commodity")
    public Result updateCommodity(@RequestBody @Valid Commodity commodity) {
        boolean flag = true;
        flag = flag && commodity.getCategory()==null;
        flag = flag && commodity.getPrice()==null;
        flag = flag && commodity.getImage()==null;
        flag = flag && commodity.getDescription()==null;
        flag = flag && commodity.getStatus()==null;
        flag = flag && commodity.getCreateTime()==null;
        flag = flag && commodity.getUpdateTime()==null;
        flag = flag && commodity.getCreateUser()==null;
        flag = flag && commodity.getUpdateUser()==null;
        if(flag){
            return Result.error("更新内容为空");
        }else {
            testService.updateCommodity(commodity);
            return Result.success();
        }
    }

    @DeleteMapping(value = "/commodity/{id}")
    public Result deleteCommodityById(@PathVariable Long id) {
        testService.deleteCommodityById(id);
        return Result.success();
    }
}
