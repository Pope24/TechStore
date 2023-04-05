package com.techstore.model.employee;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "varchar(255)")
    private String nameEmployee;
    @Column(columnDefinition = "varchar(100)")
    private String phoneNumber;
    @Column(columnDefinition = "date")
    private Date dateOfBirth;
    @Column(columnDefinition = "varchar(255)")
    private String address;
    @ManyToOne
    private Position position;
    @ManyToOne
    private Department department;
}
