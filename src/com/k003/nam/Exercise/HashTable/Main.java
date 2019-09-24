package com.k003.nam.Exercise.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer,String> listHashTable = new Hashtable<>();
        listHashTable.put(4,"Java");
        listHashTable.put(1,"C++");
        listHashTable.put(2,"PHP");
        listHashTable.put(5,"Go");
        listHashTable.put(3,"Ruby");

        System.out.println(listHashTable);
    }
}
