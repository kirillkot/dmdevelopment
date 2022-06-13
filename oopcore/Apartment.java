package com.dmdev.homework.oopcore;

public class Apartment {

    private final int number;
    private final Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Квартира №" + number + ", количество комнат " + rooms.length);
    }

    public Room[] getRooms() {
        return rooms;
    }
}
