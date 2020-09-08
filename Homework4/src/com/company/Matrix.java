package com.company;

public class Matrix {
    private int rowNumber;
    private int columnNumber;
    private int[][] matrix;

    public Matrix(){
        super();
    }

    public Matrix(int rowNumber,int columnNumber, int[][] matrix){
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.matrix = new int[rowNumber][columnNumber];
        for(int i = 0; i < rowNumber; ++i){
            for (int j = 0; j < columnNumber; ++j){
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }
    public int getRowNumber(){
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setElement(int i, int j, int value){
        matrix[i][j] = value;
    }

    public int getElement(int i, int j){
        return matrix[i][j];
    }

    public static Matrix addMatrices(Matrix first, Matrix second){
        if(first.getRowNumber() != second.getRowNumber() || first.getColumnNumber() != second.getColumnNumber()){
            System.out.println("Matrices cannot be added");
            return new Matrix();
        }
        int[][] matrix = new int[first.rowNumber][first.columnNumber];
        for(int i = 0; i < first.rowNumber; ++i){
            for (int j = 0; j < first.columnNumber; ++j){
                matrix[i][j] = first.getElement(i, j) + second.getElement(i, j);
            }
        }
        return new Matrix(first.rowNumber, first.columnNumber, matrix);
    }

    public static Matrix multiplyMatrices(Matrix first, Matrix second){
        if(first.columnNumber != second.rowNumber){
            System.out.println("Matrices cannot be multiplied");
            return new Matrix();
        }
        int[][] matrix = new int[first.rowNumber][second.columnNumber];
        for (int i = 0; i < first.rowNumber; ++i) {
            for (int j = 0; j < second.columnNumber; ++j) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < first.rowNumber; ++i){
            for (int j = 0; j < second.columnNumber; ++j){
                for(int k = 0; k < first.columnNumber ; ++k){
                    matrix[i][j] += first.getElement(i, k) * second.getElement(k, j);
                }
            }
        }
        return new Matrix(first.rowNumber, second.columnNumber, matrix);
    }

    public void print(){
        for(int i = 0; i < this.rowNumber; ++i){
            for (int j = 0; j < this.columnNumber; ++j){
                System.out.print(this.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}
