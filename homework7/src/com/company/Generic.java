package com.company;

public class Generic<T, U> {
    private T first;
    private U second;

    public Generic() {
        super();
    }

    public Generic(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void type() {
        System.out.print(first);
        System.out.println(" Type: " + first.getClass());
        System.out.print(second);
        System.out.println(" Type: " +second.getClass());
    }
}
