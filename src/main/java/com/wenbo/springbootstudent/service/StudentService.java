package com.wenbo.springbootstudent.service;

import com.wenbo.springbootstudent.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 增加学生
     * @param student
     * @return
     */
    Student saveStudent(Student student);

    /**
     * 删除单个学生
     * @param id
     * @return
     */
    void removeStudent(Long id);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    Student updateStudent(Student student);

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    Student getStudentById(Long id);

    /**
     * 获取学生列表
     * @param user
     * @return
     */
    List<Student> listStudents();
}
