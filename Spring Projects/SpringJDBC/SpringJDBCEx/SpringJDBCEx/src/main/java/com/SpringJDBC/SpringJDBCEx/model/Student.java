package com.SpringJDBC.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component     //this annotation is used to determine that the Spring framework
//is going to deal with the creation of the objects in main Application class file.
@Scope("prototype")
public class Student
{
    int Sid;
    String name;
    int marks;

    public int getSid()
    {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
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
                "Sid=" + Sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
