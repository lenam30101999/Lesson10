package com.k003.nam.Exercise.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Java");
        linkedHashMap.put(4,"C++");
        linkedHashMap.put(3,"PHP");
        linkedHashMap.put(2,"Python");
        linkedHashMap.put(5,"Ruby");

        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
