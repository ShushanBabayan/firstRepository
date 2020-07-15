package com.company;

import java.util.Comparator;

public class Plane implements Comparable<Plane>, Comparator<Plane> {
    private String name;
    private int releaseDate;
    private int hoursInAir;
    public Plane(){}
    public Plane(String name, int releaseDate, int hoursInAir){
        this.name = name;
        this.hoursInAir = hoursInAir;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public int compareTo(Plane plane){
        return this.getReleaseDate() - plane.getReleaseDate();
    }

    public int compare(Plane plane1, Plane plane2){
        return plane2.getReleaseDate() - plane1.getReleaseDate();
    }
}
