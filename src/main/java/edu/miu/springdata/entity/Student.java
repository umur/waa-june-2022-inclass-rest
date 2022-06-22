package edu.miu.springdata.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private float gpa;

    @ManyToOne
    private Course course;

}
