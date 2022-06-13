package com.dmdev.homework.oopcore;

public class Floor {

    private final int number;
    private final Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Этаж №" + number + ", количество квартир " + apartments.length);
    }

    public Apartment[] getApartments() {
        return apartments;
    }
}
