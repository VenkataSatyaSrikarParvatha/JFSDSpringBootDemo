package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.klef.jfsd.exam.model.Student;
import com.klef.jfsd.exam.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
	
    
    @GetMapping("/")
    public ModelAndView viewAllStudents() {
        ModelAndView mv = new ModelAndView();
        List<Student> stdlist = studentService.viewAllStudents();
        mv.setViewName("viewallstds");
        mv.addObject("stdlist",stdlist);
        
        Long count = studentService.stdCount();
        mv.addObject("count", count);
        
        
        return mv;
    }
    

}
