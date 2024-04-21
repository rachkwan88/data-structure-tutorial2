package com.example;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

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
    //Create a function called saveFile(filename: string, json: JSONObject)

    public void saveFile(String filename, JSONArray values) {
        String fileContent = values.toString();
        try {
            FileWriter fw = new FileWriter(filename, false);
            fw.write(fileContent);
            fw.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
