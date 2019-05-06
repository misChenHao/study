package com.bdqn.airquality.entity;

import java.io.Serializable;
import java.util.Date;

public class AirQualityIndex implements Serializable {
    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 区域编号
     */
    private Integer districtId;

    private String name;

    /**
     * 检测时间
     */
    private String monitorTime;

    /**
     * pm10值
     */
    private Integer pm10;

    /**
     * pm2.5值
     */
    private Integer pm25;

    /**
     * 监测站
     */
    private String monitoringStation;

    /**
     * 最后更改时间
     */
    private Date lastModifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(String monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation == null ? null : monitoringStation.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}