package org.jsp.Student.dao;

import java.util.List;

import java.util.Optional;

import org.jsp.Student.dto.Student;
import org.jsp.Student.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {

	@Autowired
	private Student_Repository repository;

	public void saveStudent(Student student) {
		repository.save(student);

	}

	public void deleteStudentById(int id) {
		repository.deleteById(id);
		
	}

	public Optional<Student> findById(int id) {
		return repository.findById(id);
	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}
	
	

	public void updateStudentBy(int id, Student student) {
		student.setId(id);
		repository.save(student);
		
	}

	

}
