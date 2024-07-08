package com.juani.exercises;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class IntegerListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(numbers::add); // es redundante pero estaba buscando una forma de hacer 1..10 como en JS
                                                            // esto es lo mas parecido que encontrend
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}