package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void add(Student std);
	
	List<Student> display();
	
	Student update(Student std, Integer id);
	
	void delete(Integer id);
}
