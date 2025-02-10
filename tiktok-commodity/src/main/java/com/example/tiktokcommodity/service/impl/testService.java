package com.example.tiktokcommodity.service.impl;

import com.example.tiktokcommodity.bean.Commodity;
import com.example.tiktokcommodity.bean.CommodityPreviewVo;
import com.example.tiktokcommodity.bean.addCommodity;

import java.util.List;

public interface testService {

    Commodity getCommodityById(Long id);

    CommodityPreviewVo getCommodityPreviewVoById(Long commodityId);

    List<CommodityPreviewVo> getLatestCommodityPreviewVos(Long amount);

    void addCommodity(addCommodity addCommodity);

    void updateCommodity(Commodity Commodity);

    void deleteCommodityById(Long id);

}
