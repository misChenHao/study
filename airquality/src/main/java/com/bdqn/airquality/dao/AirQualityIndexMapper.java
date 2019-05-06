package com.bdqn.airquality.dao;

import com.bdqn.airquality.entity.AirDistrict;
import com.bdqn.airquality.entity.AirQualityIndex;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirQualityIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AirQualityIndex record);

    int insertSelective(AirQualityIndex record);

    List<AirDistrict> selectByPrimaryKey(@Param("districtId") Integer districtId);

    int updateByPrimaryKeySelective(AirQualityIndex record);

    int updateByPrimaryKey(AirQualityIndex record);

    AirQualityIndex selAirQualityIndex(@Param("id")Integer id);
}