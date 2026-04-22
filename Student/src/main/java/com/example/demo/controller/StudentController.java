package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;




@RestController
public class StudentController {

	@Autowired
	private StudentService stdServ;
	
	@GetMapping("display")
	public List<Student> display() {
		return stdServ.display();
	}
	
	@PostMapping("add")
	public void add(@RequestBody Student std) {
		//TODO: process POST request
		
		stdServ.add(std);
	}
	
	@PutMapping("update/{id}")
	public Student update(@PathVariable Integer id, @RequestBody Student std) {
		//TODO: process PUT request
		
		return stdServ.update(std, id);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Integer id) {
		stdServ.delete(id);
	}
}
