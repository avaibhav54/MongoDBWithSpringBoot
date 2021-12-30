package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.Student;
import com.app.Repository.studentRepo;

@RestController
public class MyController {

	@Autowired
	private studentRepo studentRepo;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student stud)
	{
		Student savStudent=this.studentRepo.save(stud);
		return ResponseEntity.ok(savStudent);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudents()
	{
		return ResponseEntity.ok(this.studentRepo.findAll());
	}
}
