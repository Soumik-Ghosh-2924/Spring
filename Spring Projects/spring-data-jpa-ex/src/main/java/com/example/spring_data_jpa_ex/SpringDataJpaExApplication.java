package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo= context.getBean(StudentRepo.class);

		Student s1= context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);
//
//
		s1.setRollNo(100);
		s1.setName("Soumik");
		s1.setMarks(70);
//
//		s2.setRollNo(101);
//		s2.setName("Madhu");
//		s2.setMarks(90);
//
		s3.setRollNo(103);
		s3.setName("Swarnim");
		s3.setMarks(85);

		repo.save(s1);
//		repo.save(s2);
		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(101));
//
//		System.out.println(repo.findByName("Soumik"));
//
//		System.out.println(repo.findByMarksGreaterThan(85));

		repo.save(s1);

		repo.delete(s3);


	}

}
