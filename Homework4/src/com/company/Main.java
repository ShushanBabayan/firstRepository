package com.company;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else {
//                if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
//                    if(stack.empty()) {
//                        return false;
//                    }
//                    char bracket = stack.pop();
//                    switch (str.charAt(i)) {
//                        case ')': if(bracket == '{' || bracket == '[') return false; break;
//                        case '}' : if(bracket == '(' || bracket == '[') return false; break;
//                        case ']' : if(bracket == '(' || bracket == '{') return false; break;
//                    }
//                }
                if(str.charAt(i) == ')') {
                    if(stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                } else {
                    if (str.charAt(i) == '}') {
                        if (stack.empty() || stack.pop() != '{') {
                            return false;
                        }
                    } else {

                        if (str.charAt(i) == ']') {
                            if (stack.empty() || stack.pop() != '[') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        if(stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
//        int[][] arr1 = new int[3][4];
//        for(int i = 0; i < 3; ++i){
//            for(int j = 0; j < 4; ++j){
//                arr1[i][j] = i + j;
//            }
//        }
//
//        int[][] arr2 = new int[3][4];
//        for(int i = 0; i < 3; ++i){
//            for(int j = 0; j < 4; ++j){
//                arr2[i][j] = 2 * (i + j);
//            }
//        }
//        Matrix matrix1 = new Matrix(3, 4, arr1);
//        Matrix matrix2 = new Matrix(3, 4, arr2);
//        Matrix addMatrix = Matrix.addMatrices(matrix1, matrix2);
//        System.out.println("first matrix");
//        matrix1.print();
//        System.out.println("second matrix");
//        matrix2.print();
//        System.out.println("sum matrices");
//        addMatrix.print();
//
//        int[][] arr3 = new int[4][5];
//        for(int i = 0; i < 4; ++i){
//            for(int j = 0; j < 5; ++j){
//                arr3[i][j] = i + j;
//            }
//        }
//
//        Matrix matrix3 = new Matrix(4, 5, arr3);
//        System.out.println("third matrix");
//        matrix3.print();
//        Matrix productMatrix = Matrix.multiplyMatrices(matrix2, matrix3);
//        System.out.println("product matrices");
//        productMatrix.print();

//        int _key = 5_235;
//        int capacity;
//        capacity = System.in.read();
//        Queue queue = new QueueImpl(capacity);
//        try {
//            System.out.println("poll : " + queue.poll());
//            System.out.println("front : " + queue.element());
//            if(!queue.offer(5)) {
//                System.out.println("need to free up space\n");
//                System.out.println("top is " + queue.poll());
//            }
//            System.out.println("removed element is " + queue.remove());
//            System.out.println("removed element is " + queue.remove());
//            for(int i = 0; i <= capacity; ++i){
//                queue.add(i);
//                System.out.println(i);
//            }
//            if(!queue.offer(capacity)) {
//                System.out.println(capacity + "isn't added");
//            }
//
//        } catch(QueueIsFullException | QueueIsEmptyException e){
//            System.out.println(e.getMessage());
//        }
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(checkBrackets(string));

    }
}
