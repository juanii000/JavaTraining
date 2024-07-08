package com.juani.exercises.utils;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}