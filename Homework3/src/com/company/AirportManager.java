package com.company;


import java.util.Arrays;

public class AirportManager {
    public void nameAndRelease(Plane plane){
        System.out.println(plane.getName() + ":" + plane.getReleaseDate());
    }

    public void checkRelease(Plane plane){
        if (plane.getReleaseDate() > 2000){
            System.out.println(plane.getName());
        } else{
            System.out.println(plane.getHoursInAir());
        }
    }

    public String maxHours(Plane plane1, Plane plane2){
        if (plane1.getHoursInAir() > plane2.getHoursInAir()) {
            return plane1.getName();
        } else {
            return plane2.getName();
        }
    }

    public Plane maxLength(Plane plane1, Plane plane2){
        if (plane1.getName().length() > plane2.getName().length()) {
            return plane1;
        }
        return plane2;
    }

    public void maxRelease(Plane plane1, Plane plane2, String string) {
        if (plane1.getReleaseDate() > plane2.getReleaseDate()){
            System.out.println(string);
        } else {
            System.out.println("No");
        }
    }

    public void planesInfo(Plane[] planes){
        for(Plane value : planes){
            System.out.println(value.getName() + " " + value.getReleaseDate() + " " + value.getHoursInAir());
            // for each
        }
    }

    public Plane maxHoursInAir(Plane[] planes){
        int max = planes[0].getHoursInAir();
        int length = planes.length;
        int index = 0;
        for(int i =  1; i < length; ++i){
            int hour = planes[i].getHoursInAir();
            if (hour > max){
                max = hour;
                index = i;
            }
        }
        return planes[index];
    }

    public Plane[] sort(Plane[] planes, boolean sign/* character*/){
        if(sign){
            Arrays.sort(planes);
        } else {
            Arrays.sort(planes, new Plane());
        }
        return planes;
    }

    public void print(Plane plane){
        System.out.println(plane.getName() + " " + plane.getReleaseDate() + " " + plane.getHoursInAir());
    }
}
