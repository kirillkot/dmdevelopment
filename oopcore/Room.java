package com.dmdev.homework.oopcore;

public class Room {

    private final boolean walkThrough;

    public Room(boolean walkThrough) {
        this.walkThrough = walkThrough;
    }

    public void print() {
        System.out.println("Комната проходная: " + walkThrough);
    }
}
