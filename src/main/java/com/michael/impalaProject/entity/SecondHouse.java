package com.michael.impalaProject.entity;

import org.apache.ibatis.annotations.Mapper;

public class SecondHouse {
    public Integer count;
    public Integer deviceIdCount;
    public Integer loginAccountCount;
    public Integer phoneCount;
    public String dataDate;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDeviceIdCount() {
        return deviceIdCount;
    }

    public void setDeviceIdCount(Integer deviceIdCount) {
        this.deviceIdCount = deviceIdCount;
    }

    public Integer getLoginAccountCount() {
        return loginAccountCount;
    }

    public void setLoginAccountCount(Integer loginAccountCount) {
        this.loginAccountCount = loginAccountCount;
    }

    public Integer getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    @Override
    public String toString() {
        return "SecondHouse{" +
                "count=" + count +
                ", deviceIdCount=" + deviceIdCount +
                ", loginAccountCount=" + loginAccountCount +
                ", phoneCount=" + phoneCount +
                ", dataDate='" + dataDate + '\'' +
                '}';
    }
}
