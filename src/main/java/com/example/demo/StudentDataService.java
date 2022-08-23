package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDataService {

	@Autowired
	StudentRepository studentRepository;
	
	public StudentData create(StudentData a) {
		
		return studentRepository.save(a);
	}
	
	public StudentData get(Integer id) {
		return studentRepository.findById(id).orElse(null);
	}

	
}
