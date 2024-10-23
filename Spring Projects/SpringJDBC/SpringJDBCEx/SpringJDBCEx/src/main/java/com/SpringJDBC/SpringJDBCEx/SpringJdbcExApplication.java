package com.SpringJDBC.SpringJDBCEx;

import com.SpringJDBC.SpringJDBCEx.model.Student;
import com.SpringJDBC.SpringJDBCEx.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication
{

	public static void main(String[] args) {
		ApplicationContext Context= SpringApplication.run(SpringJdbcExApplication.class, args);
		System.out.println();
		System.out.println();
		System.out.println("Running Main Client ....");
		System.out.println();
		System.out.println();
		Student std = Context.getBean(Student.class);

		std.setSid(6);
		std.setName("Mayur");
		std.setMarks(60);

		StudentService serv = Context.getBean(StudentService.class);

		serv.addStudent(std);


		List<Student> std_list=serv.getStudents();
		System.out.println(std_list);




	}

}
