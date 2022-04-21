package com.xjt.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jianyao
 * @Description jdbc用于封装返回数据的一个类 ,
 * @Date 2022/2/15 16:25
 */
public class MyRowMapper implements RowMapper {

    @Override
    /**
     * @description:它总是建议实现RowMapper接口来创建自定义的RowMapper，以满足您的需求
     */
    public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student student = new Student();
        student.setBirth(resultSet.getDate("birth"));
        student.setName(resultSet.getString("name"));
        student.setId(resultSet.getString("id"));
        student.setSex(resultSet.getString("sex"));
        return student;
    }
}
