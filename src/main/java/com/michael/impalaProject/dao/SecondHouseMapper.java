package com.michael.impalaProject.dao;

import com.michael.impalaProject.entity.SecondHouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecondHouseMapper {
    List<SecondHouse> getByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);

}
