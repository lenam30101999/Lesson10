package com.k003.nam.Exercise.LinkHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 5; i >= 0; i--){
            linkedHashSet.add(i);
        }
        System.out.println(linkedHashSet);
        linkedHashSet.clear();
        System.out.println("After: ");
        if (linkedHashSet.isEmpty()){
            System.out.println("Empty!");
        }else System.out.println(linkedHashSet);
    }
}
