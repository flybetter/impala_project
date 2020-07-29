package com.michael.impalaProject.controller;

import com.michael.impalaProject.dao.SecondHouseMapper;
import com.michael.impalaProject.entity.SecondHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/impala")
public class ImpalaController {
    @Autowired
    public SecondHouseMapper secondHouseMapper;

    @GetMapping("/getByDate.do")
    public List<SecondHouse> getByDate(String startDate,String endDate){
        List<SecondHouse> secondHouses =secondHouseMapper.getByDate(startDate,endDate);
        return  secondHouses;
    }
}
