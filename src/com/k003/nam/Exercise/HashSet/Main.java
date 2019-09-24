package com.k003.nam.Exercise.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> listHashSet = new HashSet<>();
        for (int i = 5; i >= 0; i--){
            listHashSet.add(i);
        }
        listHashSet.remove(4);
        System.out.println(listHashSet);
        listHashSet.add(6);
        System.out.println(listHashSet);
    }
}
