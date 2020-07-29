package com.michael.impalaProject;

import com.michael.impalaProject.dao.SecondHouseMapper;
import com.michael.impalaProject.entity.SecondHouse;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ImpalaProjectApplicationTests {

    Logger logger= LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    public SecondHouseMapper secondHouseMapper;
//
//    @Test
//    void contextLoads() {
//
//      List<SecondHouse> list = secondHouseMapper.getByDate("2020-07-01","2020-07-05");
//      list.stream().forEach(System.out::println);
//    }

}
