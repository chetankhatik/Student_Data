package org.jsp.Student.controller;

import java.util.List;


import java.util.Optional;

import org.jsp.Student.Services.Student_Services;
import org.jsp.Student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	
	
	@Autowired
	private Student_Services services;

	
	

	@PostMapping("/save/student")
	public String saveStudent(@RequestBody Student student )
	{
		services.saveStudent(student);
		return "Data Inserted";
	}
	
	@PostMapping("/delete/student/{id}")
	public String deleteStudentById(@PathVariable int id)
	{
		services.deleteStudentById(id);
		return "Data Deleted";
	}
	
	@GetMapping("/find/student/{id}")
	public Optional<Student> findById(@PathVariable int id)
	{
		return services.findById(id);
	}
	
	@PutMapping("update/student/{id}")
	public String updateStudentById(@PathVariable int id, @RequestBody Student student)
	{
		services.UpdateStudentById(id,student);
		return "Data Updated";
	}

	
	@GetMapping("/find/all/student")
	public List<Student> findAll() {
		return services.findAll();
	}
	
}
