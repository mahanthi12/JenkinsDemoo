package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student1;
import com.example.demo.repository.StudentRepo;
@Service
public class StudentService {
	
@Autowired
StudentRepo repo;
public Student1 saveStudent(Student1 st) {
	repo.save(st);
	return st;
}
public List<Student1> findByname(String name) {
	return repo.findByname(name);
	
}
public Student1 findById(Long id){
	Optional<Student1> op=repo.findById(id);
	if(op.isPresent()) {
		return op.get();
	}
	return null;
}
public List<Student1> findBypercent(int percentage){
	return repo.findBypercentage(percentage);
}
public List<Student1> findBynameAndcollege(String name,String college){
	return repo.findByNameAndCollege(name, college);
}
public String Update(int percentage,String name) {
	String str=null;
	int i=repo.updatePercentBasedOnName(percentage, name);
	if(i==1) {
		str= "Updated";
	}else {
		str= "Not Updated";
	}
	return str;
}
	
}
