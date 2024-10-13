package com.project.spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.spring_data_jpa.model.Student;
import com.project.spring_data_jpa.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		//! --> FOR INSERTING DATA
		// Student s1 = context.getBean(Student.class);
		// Student s2 = context.getBean(Student.class);
		// Student s3 = context.getBean(Student.class);

		// s1.setStudentNo(101);
		// s1.setName("Muhammed");
		// s1.setMark(95);

		// s2.setStudentNo(102);
		// s2.setName("Zehra");
		// s2.setMark(90);

		// s3.setStudentNo(103);
		// s3.setName("Yilmaz");
		// s3.setMark(86);

		// repository.save(s1);
		// repository.save(s2);
		// repository.save(s3);

		//! --> FOR FETCHING DATA
		System.out.println(repository.findAll());

	}

}
