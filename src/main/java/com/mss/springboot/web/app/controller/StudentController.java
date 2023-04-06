package com.mss.springboot.web.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mss.springboot.web.app.entity.Student;
import com.mss.springboot.web.app.repo.StudentRepo;


@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping({"/students", "/"})
	public String homePage(Model model) {
		model.addAttribute("students", repo.findAll());
		return "index";
	}
	
	
	//	New Student
	@GetMapping("/students/new")
	public String newStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "add_student";
	}
	
	
	//	Save Student
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		repo.save(student);
		
		return "redirect:/";
	}
	
	
	//	Update Student
	@GetMapping("/students/edit/{id}")
	public String updateStudent(@PathVariable("id") int id, Model model) {
		Optional<Student> temp=repo.findById(id);
		Student student = temp.get();
		model.addAttribute("student", student);
		
		return "update_student";
	}
	
	
	//	Detele Student
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		repo.deleteById(id);
		
		return "redirect:/";
	}
	
	
	
}