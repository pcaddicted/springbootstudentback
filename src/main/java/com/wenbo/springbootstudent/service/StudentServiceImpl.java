package com.wenbo.springbootstudent.service;

import com.wenbo.springbootstudent.entity.Student;
import com.wenbo.springbootstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //注入StudentRepositoryJPA
    @Autowired
    StudentRepository studentReposutory;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public void removeStudent(Long id) {

    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentReposutory.getOne(id);
    }

    @Override
    public List<Student> listStudents() {
        return studentReposutory.findAll();
    }
}
