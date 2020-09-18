package com.xiaofsu.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/sql")
    public String sql(String sql){
        return testMapper.sql(sql);
    }

    @RequestMapping("/sql2")
    public String sql2(String sql){

        String ySql = "select * from tbl_sys_user where name = ? ";
//        PreparedStatement pstmt = new Pre

        return testMapper.sql2(sql);
    }

}
