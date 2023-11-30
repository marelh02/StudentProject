package com.example.StudentsProject;

import com.example.StudentsProject.entities.Student;
import com.example.StudentsProject.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

	@Autowired
	StudentRepository sr;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}


	@Bean
	CommandLineRunner test() {
		return (args) -> {
			System.out.println("*** Adding new students ***");/*
			sr.saveAll(List.of(new Student("Elhilali","Marouane",21),
					new Student("Errafia","Imane",22)));
			System.out.println("*** Fetching all students ***");
			sr.findAll().forEach(student -> System.out.println(student));*/
			System.out.println(sr.findStudentByFamilyName("Elhilali"));
		};

	}
}
