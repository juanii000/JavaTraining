package com.juani.exercises.utils;

import java.util.ArrayList;

/*
Stack operations:
push
pop
peek
isEmpty
size
*/

public class Stack<T> {
    private ArrayList<T> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
