package org.jsp.Student.Services;

import java.util.List;
import java.util.Optional;

import org.jsp.Student.dao.Student_Dao;
import org.jsp.Student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Services {
	
	@Autowired
	private Student_Dao dao;
	
	public void saveStudent(Student student) {
		dao.saveStudent(student);
		
	}

	public void deleteStudentById(int id) {
		dao.deleteStudentById(id);
		
	}

	public Optional<Student> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public void UpdateStudentById(int id, Student student) {
		// TODO Auto-generated method stub
		dao.updateStudentBy(id,student);
		
	}
	
	public List<Student> findAll() {
		return dao.findAll();
	}

}
