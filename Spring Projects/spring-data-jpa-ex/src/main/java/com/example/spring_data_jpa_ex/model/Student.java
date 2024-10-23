package com.example.spring_data_jpa_ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component     //this annotation is used to determine that the Spring framework
//is going to deal with the creation of the objects in main Application class file.
@Scope("prototype")
@Entity  //added this annotation in order to state that jpa is going to mnake a table named Student
public class Student
{
    @Id //in order to mention that it is the primary key.
    private int RollNo;
    private String name;
    private int marks;

    public int getRollNo()
    {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "Sid=" + RollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
