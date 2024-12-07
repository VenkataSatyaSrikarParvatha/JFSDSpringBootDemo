package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Student;
import com.klef.jfsd.exam.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	
    @Autowired
    private StudentRepository studentRepository;

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public long stdCount() {
		// TODO Auto-generated method stub
		return studentRepository.count();
	}

}
