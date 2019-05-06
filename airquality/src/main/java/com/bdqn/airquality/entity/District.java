package com.bdqn.airquality.entity;

import java.io.Serializable;

public class District implements Serializable {
    /**
    * 区域编号
    */
    private Integer id;

    /**
    * 区域名称
    */
    private String name;

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
        this.name = name == null ? null : name.trim();
    }
}