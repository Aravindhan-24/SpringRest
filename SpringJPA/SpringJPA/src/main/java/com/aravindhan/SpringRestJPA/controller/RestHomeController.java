package com.aravindhan.SpringRestJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aravindhan.SpringRestJPA.Repository.StudentRepository;
import com.aravindhan.SpringRestJPA.beans.Student;



@RestController
public class RestHomeController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping(path="/students")
	public Student addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	
	@GetMapping(path="/students")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	@GetMapping(path="/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id")int student_id) {
		return studentRepository.findById(student_id);
	}
	
	@DeleteMapping(path="/student/{id}")
	public String deleteStudent(@PathVariable("id") int student_id) {
		studentRepository.deleteById(student_id);
		return "Deleted";
	}
	
	@PutMapping(path="/student")
	public Student updateStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}

}
