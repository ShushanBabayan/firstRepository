package com.company;

import java.util.Comparator;

public class ComparatorUsingName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getName() .compareTo(s1.getName());
    }
}