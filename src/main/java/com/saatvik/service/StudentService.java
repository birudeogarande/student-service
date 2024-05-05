package com.saatvik.service;

import com.saatvik.model.Student;
import com.saatvik.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> findAll(){
        return studentRepo.findAll(Sort.by("name"));
    }

    public List<Student> saveBatch(List<Student> students){
        return studentRepo.saveAll(students);
    }
}
