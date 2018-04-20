package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}