package com.juani.exercises.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class JSONReader {
    public static void main(String[] args) {
        InputStream jsonFile = JSONReader.class.getClassLoader().getResourceAsStream("data.json"); //IA generated json
        if (jsonFile == null) {
            throw new NullPointerException("Cannot find resource file resources/data.json");
        }

        JSONTokener tokener = new JSONTokener(jsonFile);
        JSONObject jsonObject = new JSONObject(tokener);

        JSONArray users = jsonObject.getJSONArray("users");

        users.forEach(System.out::println); //Work with the data in users

    }
}
