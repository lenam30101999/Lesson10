package com.k003.nam.Exercise.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> listTreeSet = new TreeSet<>();

        for (int i = 0; i < 5; i++){
            treeSet.add(i);
        }

        listTreeSet.add(10);
        listTreeSet.addAll(treeSet);
        System.out.println(listTreeSet.first() + " " + listTreeSet.last());
        System.out.println(listTreeSet);
    }
}
