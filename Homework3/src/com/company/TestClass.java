package com.company;

public class TestClass {

    public static void main(String[] args){
        Plane plane1 = new Plane("Boing", 1987, 64);
        Plane plane2 = new Plane("Boing", 2002, 30);
        Plane plane3 = new Plane("TU", 1991, 53);
        Plane plane4 = new Plane("TU", 2010, 10);
        AirportManager manager = new AirportManager();
        manager.nameAndRelease(plane1);
        manager.checkRelease(plane3);
        System.out.println(manager.maxHours(plane1, plane3));
        manager.print(manager.maxLength(plane2, plane4));
        String string = new String("First plane is older");
        manager.maxRelease(plane4, plane2, string);
        Plane[] planes = new Plane[]{plane1, plane2, plane3, plane4};
        manager.planesInfo(planes);
        manager.print(manager.maxHoursInAir(planes));
        manager.planesInfo(manager.sort(planes, true));
        manager.planesInfo(manager.sort(planes, false));
    }
}
