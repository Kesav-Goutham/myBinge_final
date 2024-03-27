package com.sjprogramming.restapi.controller;

import java.util.List;

import com.sjprogramming.restapi.entity.main_poster;
import com.sjprogramming.restapi.repository.Main_poster_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.StudentRepository;

@RestController
public class StudentControler {
	
	@Autowired
	StudentRepository repo;
	@Autowired
	Main_poster_repo mainPosterRepo;
	//get all the students 
	//localhost:8080/students
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		 List<Student> students = repo.findAll();
		  return students;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/mainPoster")
	public List<main_poster> getmainPoster(){
		List<main_poster> students = mainPosterRepo.findAll();
		return students;
	}
	
	//localhost:8080/students/1
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		
		return student;
		
	}
	
	@PostMapping("/student/add")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student newStudent = repo.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
		
	}
	
//	@PutMapping("/student/update/{id}")
//	public Student updateStudents(@PathVariable int id) {
//	   Student student = repo.findById(id).get();
//	   student.setName("poonam");
//	   student.setPercentage(92);
//	   repo.save(student);
//	   return student;
//
//	}
	@DeleteMapping("/student/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}

}
