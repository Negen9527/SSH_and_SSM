package com.negen.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negen.dao.StudentMapper;
import com.negen.model.Student;
import com.negen.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Resource
	private StudentMapper studentMapper;

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public List<Student> selectAll() {
		return studentMapper.selectAllStu();
	};
	
}
