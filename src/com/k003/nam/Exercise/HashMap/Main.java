package com.k003.nam.Exercise.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> listHashMap = new HashMap<>();
        listHashMap.put(1,"AB");
        listHashMap.put(4,"CD");
        listHashMap.put(2,"EF");
        listHashMap.put(5,"GH");
        listHashMap.put(3,"JK");

        listHashMap.remove(2);
        Set<Integer> keySet = listHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " +listHashMap.get(key));
        }
    }
}
