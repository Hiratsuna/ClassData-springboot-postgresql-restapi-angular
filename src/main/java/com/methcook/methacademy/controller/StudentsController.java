package com.methcook.methacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.methcook.methacademy.exception.ResourceNotFoundException;
import com.methcook.methacademy.model.Student;
import com.methcook.methacademy.repository.StudentsRepository;

@RestController
@RequestMapping("/api/v1/")
public class StudentsController {

	@Autowired
	private StudentsRepository studentsRepository;
	
	
	// get student
	
	@GetMapping("students")
	public List<Student> getAllStudent(){
		return this.studentsRepository.findAll();
	}

	
	// get student by id
	
	@GetMapping("/student/{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
				throws ResourceNotFoundException {
			Student students = studentsRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundExceptuion("Student not found for this Id :: " + studentId))
			return ResponseEntity.ok().body(students);
	}
	
	// save student
	// update student
	// delete student
}
