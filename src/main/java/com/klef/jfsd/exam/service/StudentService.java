package com.klef.jfsd.exam.service;

import java.util.List;

import com.klef.jfsd.exam.model.Student;

public interface StudentService {
    public List<Student> viewAllStudents();
    
    public long stdCount();
}
