package com.bdqn.airquality.service.impl;

import com.bdqn.airquality.common.service.impl.BaseServiceImpl;
import com.bdqn.airquality.dao.AirQualityIndexMapper;
import com.bdqn.airquality.dao.DistrictMapper;
import com.bdqn.airquality.entity.AirDistrict;
import com.bdqn.airquality.entity.AirQualityIndex;
import com.bdqn.airquality.entity.District;
import com.bdqn.airquality.service.IndexService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("indexService")
public class IndexServiceImpl extends BaseServiceImpl implements IndexService {
    @Resource
    private AirQualityIndexMapper airQualityIndexMapper;
    @Resource
    private DistrictMapper districtMapper;

    @Override
    public PageInfo<AirDistrict> selAirQualityIndex(int page,int pageSize,Integer districtId) {
        PageHelper.startPage(page,pageSize);
        List<AirDistrict> airDistricts=airQualityIndexMapper.selectByPrimaryKey(districtId);
        PageInfo<AirDistrict> result=new PageInfo<>(airDistricts);
        return result;
    }

    @Override
    public int insAirQualityIndex(AirQualityIndex airQualityIndex) {
        return airQualityIndexMapper.insert(airQualityIndex);
    }

    @Override
    public List<District> selectAll() {
        return districtMapper.selectByPrimaryKey();
    }

    @Override
    public AirQualityIndex selAirQualityIndex(Integer id) {
        return airQualityIndexMapper.selAirQualityIndex(id);
    }

    @Override
    public int updateByPrimaryKey(AirQualityIndex record) {
        return airQualityIndexMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return airQualityIndexMapper.deleteByPrimaryKey(id);
    }
}
