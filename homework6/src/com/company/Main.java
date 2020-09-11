package com.company;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FunctionManager manager = new FunctionManager();

        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("enter numbers");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (!string.equals("")) {
            array.add(Integer.parseInt(string));
            string = scanner.nextLine();
        }

        manager.print(array);
        manager.maxElement(array);
        manager.minElement(array);
        manager.maxIndex(array);
        manager.minIndex(array);
        manager.sortAsc(array);
        manager.sortDesc(array);
        manager.divideByThree(array);

        ArrayList<String> strings = new ArrayList<>();
        System.out.println("enter strings");
        string = scanner.nextLine();
        while (!string.equals("")) {
            strings.add(string);
            string = scanner.nextLine();
        }

        manager.existA(strings);
        manager.longerThen7(strings);

        Student student1 = new Student("Shushan", 20);
        Student student2 = new Student("Anna", 18);
        Student student3 = new Student("Astghik", 22);
        Student student4 = new Student("Mane", 23);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        manager.olderThen22(students);
        manager.smallerThen27(students);
        manager.sort(students, true);
        manager.sort(students, false);
    }
}
