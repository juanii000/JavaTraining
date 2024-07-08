package com.juani.exercises.controller;

import com.juani.exercises.shapes.Circle;
import com.juani.exercises.shapes.Rectangle;
import com.juani.exercises.shapes.Triangle;
import com.juani.exercises.utils.Message;
import com.juani.exercises.utils.PriorityQueue;
import com.juani.exercises.utils.Stack;
import com.juani.exercises.utils.WordFrequencyCounter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/test")
public class GeneralController {

    @PostMapping("/countWords")
    public Message countWords(@RequestBody String message) { return new Message(WordFrequencyCounter.countWordFrequency(message).toString());
    }

    @GetMapping("/stacktest")
    public Message stacktest() {
        Stack<String> stack = new Stack<>();

        stack.push("h");
        stack.push("o");
        stack.push("l");
        stack.push("a");

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        return new Message(stack.peek());
    }

    @GetMapping("/quetest")
    public Message quetest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000);
            pq.add(randomNumber);
        }

        System.out.println(pq.toString());

        System.out.println("Top element is: " + pq.peek());
        System.out.println("Queue size is: " + pq.size());
        System.out.println("Polled element is: " + pq.poll());
        System.out.println("Top element is: " + pq.peek());
        System.out.println("Queue size is: " + pq.size());

        return new Message(pq.toString());
    }

    @GetMapping("/shapes")
    public Message getShapes() {

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(5,6,3,2,1);

        return new Message( circle.toString() + rectangle.toString() + triangle.toString() );
    }
}
