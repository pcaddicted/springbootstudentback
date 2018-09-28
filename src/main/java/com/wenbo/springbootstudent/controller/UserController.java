package com.wenbo.springbootstudent.controller;

import com.wenbo.springbootstudent.entity.Msg;
import com.wenbo.springbootstudent.entity.ResultUtil;
import com.wenbo.springbootstudent.entity.Student;
import com.wenbo.springbootstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public Msg listStudents(){
        List<Student> students=studentService.listStudents();
        System.out.println("这儿");
        return ResultUtil.success(students);
    }
}
