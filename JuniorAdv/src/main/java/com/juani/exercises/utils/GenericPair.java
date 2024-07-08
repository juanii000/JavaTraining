package com.juani.exercises.utils;

public class GenericPair<T, U> {
    private T a;
    private U b;

    public GenericPair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    public T getFirst() {
        return a;
    }

    public void setFirst(T a) {
        this.a = a;
    }

    public U getSecond() {
        return b;
    }

    public void setSecond(U b) {
        this.b = b;
    }
}