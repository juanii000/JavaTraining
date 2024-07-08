package com.juani.exercises.utils;

import java.util.LinkedList;

public class PriorityQueue<T extends Comparable<T>> {
    private LinkedList<T> elements = new LinkedList<>();

    public void add(T element) {
        int i = 0;
        while (i < elements.size() && element.compareTo(elements.get(i)) > 0) {
            i++;
        }
        elements.add(i, element);
    }

    public T poll() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return this.elements.toString();
    }
}