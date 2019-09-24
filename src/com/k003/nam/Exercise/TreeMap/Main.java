package com.k003.nam.Exercise.TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"ABC");
        treeMap.put(2,"CD");
        treeMap.put(4,"JKL");
        treeMap.put(3,"EFG");

        System.out.println(treeMap);
    }
}
