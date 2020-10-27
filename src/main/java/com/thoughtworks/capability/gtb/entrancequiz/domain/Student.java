package com.thoughtworks.capability.gtb.entrancequiz.domain;


public class Student {

    private int id;
    private String name;

    Student(){

    }

    public Student(int id,String name){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

