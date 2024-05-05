package com.saatvik.controller;

import com.saatvik.model.Student;
import com.saatvik.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getALL(){
        return studentService.findAll();
    }

    @PostMapping
    public List<Student> saveStudentList(@RequestBody List<Student> students){
        return studentService.saveBatch(students);
    }




}
