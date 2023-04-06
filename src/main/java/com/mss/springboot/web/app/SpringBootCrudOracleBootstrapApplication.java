package com.mss.springboot.web.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mss.springboot.web.app.entity.Student;
import com.mss.springboot.web.app.repo.StudentRepo;

@SpringBootApplication
public class SpringBootCrudOracleBootstrapApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepo repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOracleBootstrapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student("Mario", "Mexico", "mario.mz@gmail.com");
		Student s2 = new Student("Julio", "Jalisco", "julio.122z@gmail.com");
		Student s3 = new Student("Ana", "Toluca", "ana.8324@gmail.com");
		Student s4 = new Student("Laura", "Queretaro", "lau.m32@gmail.com");
		Student s5 = new Student("Mike", "Mexico", "mike.ss@gmail.com");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		repo.save(s5);
	}
	
	

}