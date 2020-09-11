package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionManager {
    public void print(ArrayList<Integer> array) {
        for(int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void maxElement(ArrayList<Integer> array) {
        int max = array.get(0);
        for(int element : array) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }

    public void minElement(ArrayList<Integer> array) {
        int min = array.get(0);
        for(int element : array) {
            if(element < min) {
                min = element;
            }
        }
        System.out.println(min);
    }

    public void maxIndex(ArrayList<Integer> array) {
        int max = 0;
        for(int i = 0; i < array.size(); ++i) {
            if(array.get(i) >= array.get(max)) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public void minIndex(ArrayList<Integer> array) {
        int min = 0;
        for(int i = 0; i < array.size(); ++i) {
            if(array.get(i) <= array.get(min)) {
                min = i;
            }
        }
        System.out.println(min);
    }

    public void sortAsc(ArrayList<Integer> array) {
        Collections.sort(array);
        print(array);
    }

    public void sortDesc(ArrayList<Integer> array) {
        Collections.sort(array, Collections.reverseOrder());
        print(array);
    }

    public void divideByThree(ArrayList<Integer> array) {
        Collections.sort(array, Collections.reverseOrder());
        for(int element : array) {
            if(element % 3 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public void existA(ArrayList<String> stringArray) {
        for (String string : stringArray) {
            if(string.contains("a")) {
                System.out.print(string + " ");
            }
        }
        System.out.println();
    }

    public void longerThen7(ArrayList<String> stringArray) {
        for(String string : stringArray) {
            if(string.length() > 7) {
                System.out.print(string + " ");
            }
        }
        System.out.println();
    }

    public void olderThen22 (ArrayList<Student> studentArray) {
        for (Student student : studentArray) {
            if (student.getAge() > 22) {
                student.print();
            }
        }
    }

    public void smallerThen27 (ArrayList<Student> studentArray) {
        for (Student student : studentArray) {
            if(student.getAge() < 27 && (student.getName().charAt(0) == 'A' || student.getName().charAt(0) == 'B')) {
                student.print();
            }
        }
    }

    public void sort(ArrayList<Student> studentArray, boolean flag) {
        if(flag) {
            Collections.sort(studentArray, new ComparatorUsingAge());
        } else {
            Collections.sort(studentArray, new ComparatorUsingName());
        }
        for(Student student : studentArray) {
            student.print();
        }
    }


}
