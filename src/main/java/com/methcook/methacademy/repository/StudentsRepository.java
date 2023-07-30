package com.methcook.methacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.methcook.methacademy.model.Student;

// this below creates a spring component and automatically scans it 

public interface StudentsRepository extends JpaRepository<Student, Long>{
	
	

}
