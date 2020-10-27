package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

public class Group {
    private String name;
    List<Student> students;

    public Group(){

    }

    public Group(String name,List<Student> students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
