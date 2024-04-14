package com.example;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

public class Tutorial {

    public JSONArray generateRandomIntegerList(int num) {
        Random rand = new Random();
        JSONArray list1 = new JSONArray();
        for(int i=0;i< num ;i++){
            int x = rand.nextInt(1000);
            JSONObject obj = new JSONObject();
            obj.put("value", x);
            list1.put(obj);
        }
        return list1;
    }
}
