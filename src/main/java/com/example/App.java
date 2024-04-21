package com.example;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Tutorial test1 = new Tutorial();
        JSONArray array = test1.generateRandomIntegerList(10);
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            int x = obj.getInt("value");
            System.out.println(x);
        }

        test1.saveFile("integers.json",array);
    }
}
