package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository stdRepo;
	
	@Override
	public void add(Student std) {
		// TODO Auto-generated method stub
		stdRepo.save(std);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return stdRepo.findAll();
	}

	@Override
	public Student update(Student std, Integer id) {
		// TODO Auto-generated method stub
		std.setId(id);
		return stdRepo.save(std);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		stdRepo.deleteById(id);
	}

}
