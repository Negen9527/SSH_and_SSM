package ssm_demo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.negen.model.Student;
import com.negen.service.StudentService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private StudentService studentService = null;
	@Test
	public void mytest() {
		List<Student> students = studentService.selectAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
