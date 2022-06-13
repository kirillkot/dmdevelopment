package com.dmdev.homework.oopcore;

public class House {

    private final int number;
    private final Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом №" + number + ", количество этажей " + floors.length);
    }

    public Floor[] getFloors() {
        return floors;
    }
}
