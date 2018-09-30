package com.wenbo.springbootstudent.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //标识其是一个主键id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示其增长策略为自增长
    private Long id;//学生的唯一标识

    @NotEmpty(message = "姓名不能为空")
    @Column(nullable = false, length = 20,name="name") // 映射为字段，值不能为空,name标识的是数据库的名字
    private String name;//学生的姓名

    @NotEmpty(message = "性别不能为空")//NotEmpty只能针对字符型才能进行判断空
    @Column(nullable = false,name="sex") // 映射为字段，值不能为空,name标识的是数据库的名字
    private Integer sex;

    @Column(nullable = false,name="age") // 映射为字段，值不能为空,name标识的是数据库的名字
    private Integer age;

    @Column(name="course_id")
    private Integer course_id;//学生所选的所有课程

    @Column(name="hometown")
    private String hometown;//学生家乡

    @Column(name="number")
    private String number;//学生学号

    @Column(name="telephone")
    private String telephone;//学生手机号

    protected Student() {//按照JPA规范定义的一个protected的构造函数,防止被外部使用
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Student(String name, Integer sex, Integer age, Integer course_id) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course_id = course_id;
    }


    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 重写tostring的原因其实就是数据的传输,所以也必须实现序列化接口serialize接口
     * 自从jquery1.9后,json的格式必须满足的是:[{"key":"value"},{"key":"value"}]的格式,除了Boolean型不需要外,其余都是需要的
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course_id=" + course_id +
                ", hometown='" + hometown + '\'' +
                ", number='" + number + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}