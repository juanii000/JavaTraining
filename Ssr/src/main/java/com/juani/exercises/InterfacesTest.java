package com.juani.exercises;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class InterfacesTest implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

}