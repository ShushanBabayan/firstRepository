package com.company;

public class Student {
    private String name;
    public Student(){
        this.name = "Unknown";
    }
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Anna");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
