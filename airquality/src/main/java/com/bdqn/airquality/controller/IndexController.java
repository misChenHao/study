package com.bdqn.airquality.controller;

import com.bdqn.airquality.common.utils.JsonUtil;
import com.bdqn.airquality.entity.AirDistrict;
import com.bdqn.airquality.entity.AirQualityIndex;
import com.bdqn.airquality.entity.District;
import com.bdqn.airquality.service.IndexService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    private IndexService indexService;

    @PostMapping("selAirQualityIndex")
    public String selAirQualityIndex(Integer districtId, @RequestParam(name = "page", required = false, defaultValue = "1") int page) {
        PageInfo<AirDistrict> airQualityIndices = indexService.selAirQualityIndex(page, 4, districtId);
        return JsonUtil.getResponseJson(0, "ok", airQualityIndices);
    }

    @PostMapping("insAirQualityIndex")
    public String insAirQualityIndex(AirQualityIndex airQualityIndex) {
        airQualityIndex.setLastModifyTime(new Date());
        int row = indexService.insAirQualityIndex(airQualityIndex);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "添加成功", null);
        } else {
            return JsonUtil.getResponseJson(1, "添加失败", null);
        }
    }

    @PostMapping("selectAll")
    public String selectAll() {
        List<District> districts = indexService.selectAll();
        if (districts.size() > 0) {
            return JsonUtil.getResponseJson(0, "查询成功", districts);
        } else {
            return JsonUtil.getResponseJson(1, "查询失败", null);
        }
    }

    @PostMapping("selectAirQualityIndex")
    public String selectAirQualityIndex(Integer id) {
        AirQualityIndex airQualityIndex = indexService.selAirQualityIndex(id);
        if (airQualityIndex != null) {
            return JsonUtil.getResponseJson(0, "ok", airQualityIndex);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }

    @PostMapping("upAirQualityIndex")
    public String upAirQualityIndex(AirQualityIndex airQualityIndex) {
        int row = indexService.updateByPrimaryKey(airQualityIndex);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "修改成功！", null);
        } else {
            return JsonUtil.getResponseJson(1, "修改失败！", null);
        }
    }

    @PostMapping("delAirQualityIndex")
    public String delAirQualityIndex(Integer id) {
        int row = indexService.deleteByPrimaryKey(id);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "删除成功！", null);
        } else {
            return JsonUtil.getResponseJson(1, "删除失败！", null);
        }
    }
}
