package com.xiaofsu.demo.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("select * from tbl_sys_user where name = #{sql} ")
    String sql(@Param("sql") String sql);


    @Select("select * from tbl_sys_user where name = ${sql} ")
    String sql2(@Param("sql") String sql);
}
