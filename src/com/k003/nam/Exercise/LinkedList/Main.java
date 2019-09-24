package com.k003.nam.Exercise.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("E");
        linkedList.add("H");

        System.out.println("Before remove: ");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println("After remove: ");
        System.out.println(linkedList);
    }
}
