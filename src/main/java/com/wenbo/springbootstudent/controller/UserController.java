package com.wenbo.springbootstudent.controller;

import com.wenbo.springbootstudent.entity.Msg;
import com.wenbo.springbootstudent.entity.ResultUtil;
import com.wenbo.springbootstudent.entity.Student;
import com.wenbo.springbootstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public Msg listStudents(){
        List<Student> students=studentService.listStudents();
        return ResultUtil.success(students);
    }

    @GetMapping(value="/{id}")
    public Msg getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        return ResultUtil.success(student);
    }
}
