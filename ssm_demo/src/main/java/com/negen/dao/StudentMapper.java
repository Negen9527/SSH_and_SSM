package com.negen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.negen.model.Student;


public interface StudentMapper {
	@Select("select * from student")
	public List<Student> selectAllStu();
}
