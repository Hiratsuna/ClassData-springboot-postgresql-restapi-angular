package com.methcook.methacademy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("students/{id}")
	public List<Student> getAllStudent(){
		return this.studentsRepository.findAll();
	}

	
	// get student by id
	
	@GetMapping("/students/{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
				throws ResourceNotFoundException {
			Student students = studentsRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found for this Id :: " + studentId));
			return ResponseEntity.ok().body(students);
	}
	
	// save student
	@PostMapping("students")
	public Student createStudent(@RequestBody Student student) {
		return this.studentsRepository.save(student);
	}
	
	// update student
	@PutMapping("students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
			@Valid @RequestBody Student studentDetails) throws ResourceNotFoundException{
		
		Student student = studentsRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found for this id ::" + studentId ));
		student.setEmail(studentDetails.getEmail());
		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		
		return ResponseEntity.ok(this.studentsRepository.save(student));
	}
	// delete student
	@DeleteMapping("students/{id}")
	public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId){
	.orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
		
		this.studentsRepository.delete(student);
	}
}
