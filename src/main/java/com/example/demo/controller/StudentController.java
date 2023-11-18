package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student1;
//import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	//StudentRepo repo1;
	StudentService service;

	@PostMapping("/savestudent")
	public Student1 saveStudentDetails(@RequestBody Student1 st) {
		try {
			service.saveStudent(st);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	
	@GetMapping("/findById/{id}")
	public Student1 getById(@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping("/findByname/{name}")
	public List<Student1> getNames(@PathVariable String name){
		return service.findByname(name);
	}
	@GetMapping("/findBypercent/{percentage}")
	public List<Student1> getAllPercent(@PathVariable int percentage){
		return service.findBypercent(percentage);
	}
	@GetMapping("/findBynameAndcollege/{name}/{college}")
	public List<Student1> getNameAndCollege(@PathVariable String name,@PathVariable String college){
		return service.findBynameAndcollege(name, college);
	}
	@PutMapping("/perNamechanging/{percentage}/{name}")
	public String namePercChange(@PathVariable int percentage,@PathVariable String name) {
		return service.Update(percentage, name);
	}
}
