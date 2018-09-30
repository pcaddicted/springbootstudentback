package com.wenbo.springbootstudent.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Admin implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示其增长策略为自增长
    private Long id;//学生的唯一标识

    @Column
    private String password;
    @Column
    private String username;

    protected Admin() {//按照JPA规范定义的一个protected的构造函数,防止被外部使用
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
