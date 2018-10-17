package com.negen.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.xdevapi.JsonArray;
import com.negen.model.Student;
import com.negen.service.StudentService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
//@RequestMapping(value="/say")
public class MyTestController {
	@Resource
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@ResponseBody
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public JSONObject sayHello() {
//		model.addAttribute("message","Hello SSM");
		List<Student> students = studentService.selectAll();
		JSONArray studentArrary = new JSONArray();
		for (Student student : students) {
			JSONObject temp = new JSONObject(); 
			temp.put("id", student.getId());
			temp.put("name", student.getName());
			temp.put("age", student.getAge());
			studentArrary.add(temp);
		}
		JSONObject ret = new JSONObject();
		ret.put("students", studentArrary);
		
		return ret;
	}
}
