package com.company;

public class Car {
    private String brand;
    public Car(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public static void main(String[] args){
        Car car = new Car("Ford");
        String brand = car.getBrand();
        System.out.println(brand);
    }
}
