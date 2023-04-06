package com.mss.springboot.web.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.springboot.web.app.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	
	
	
}