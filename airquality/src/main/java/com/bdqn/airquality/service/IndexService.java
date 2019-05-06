package com.bdqn.airquality.service;

import com.bdqn.airquality.entity.AirDistrict;
import com.bdqn.airquality.entity.AirQualityIndex;
import com.bdqn.airquality.entity.District;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IndexService {
    PageInfo<AirDistrict> selAirQualityIndex(int page, int pageSize, Integer districtId);

    int insAirQualityIndex(AirQualityIndex airQualityIndex);

    List<District> selectAll();

    AirQualityIndex selAirQualityIndex(Integer id);

    int updateByPrimaryKey(AirQualityIndex record);

    int deleteByPrimaryKey(Integer id);
}
