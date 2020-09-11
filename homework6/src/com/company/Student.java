package com.company;

public class Student {
    private String name;
    private int age;

    Student() {
        super();
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
