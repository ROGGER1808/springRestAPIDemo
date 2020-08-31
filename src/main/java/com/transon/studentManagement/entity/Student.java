package com.transon.studentManagement.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String fullName;

    @Column
    private Integer age;

    @Column
    private String address;

    @Column
    private String email;
}
