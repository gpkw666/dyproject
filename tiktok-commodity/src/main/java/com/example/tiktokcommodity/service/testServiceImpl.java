package com.example.tiktokcommodity.service;

import com.example.tiktokcommodity.bean.Commodity;
import com.example.tiktokcommodity.bean.CommodityPreviewVo;
import com.example.tiktokcommodity.bean.addCommodity;
import com.example.tiktokcommodity.mapper.ComMapper;
import com.example.tiktokcommodity.service.impl.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {

    @Autowired
    private ComMapper comMapper;

    @Override
    public Commodity getCommodityById(Long commodityId) {
        return comMapper.getCommodityById(commodityId);
    }

    @Override
    public CommodityPreviewVo getCommodityPreviewVoById(Long commodityId) {
        return comMapper.getCommodityPreviewVoById(commodityId);
    }

    @Override
    public List<CommodityPreviewVo> getLatestCommodityPreviewVos(Long amount) {
        return comMapper.getLatestCommodityPreviewVos(amount);
    }

    @Override
    public void addCommodity(addCommodity addCommodity) {
        if (addCommodity.getImage() == null) {
            addCommodity.setImage("defaultImage");//此处需要放置默认图片，此处仅为示意
        }
        if (addCommodity.getStatus() == null) {
            addCommodity.setStatus(1);//此处需要放置默认状态，此处仅为示意
        }
        comMapper.addCommodity(addCommodity);
    }

    @Override
    public void updateCommodity(Commodity Commodity) {
        comMapper.updateCommodity(Commodity);
    }

    @Override
    public void deleteCommodityById(Long commodityId) {
        comMapper.deleteCommodityById(commodityId);
    }
}