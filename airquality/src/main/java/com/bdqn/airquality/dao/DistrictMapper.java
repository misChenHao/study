package com.bdqn.airquality.dao;

import com.bdqn.airquality.entity.District;

import java.util.List;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByPrimaryKey();

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}