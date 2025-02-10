package com.example.tiktokcommodity.mapper;

import com.example.tiktokcommodity.bean.Category;
import com.example.tiktokcommodity.bean.Commodity;
import com.example.tiktokcommodity.bean.CommodityPreviewVo;
import com.example.tiktokcommodity.bean.addCommodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComMapper {

    Commodity getCommodityById(Long id);

    CommodityPreviewVo getCommodityPreviewVoById(Long id);

    List<CommodityPreviewVo> getLatestCommodityPreviewVos(Long amount);

    Category getCategoryById(Long id);

    void addCommodity(addCommodity addCommodity);

    void updateCommodity(Commodity Commodity);

    void deleteCommodityById(Long id);
}
