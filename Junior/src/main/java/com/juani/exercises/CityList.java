package com.juani.exercises;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CityList {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Buenos aires");
        cities.add("Tandil");
        cities.add("Rosario");
        cities.add("Cordoba");

        cities.forEach(System.out::println);

        // Trying some internet examples
        // to test queue and deque

        System.out.println("##################################");

        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        String head = queue.poll();
        System.out.println("Head of queue: " + head);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("##################################");

        Deque<String> stack = new LinkedList<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        String top = stack.pop();
        System.out.println("Top of stack: " + top);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
