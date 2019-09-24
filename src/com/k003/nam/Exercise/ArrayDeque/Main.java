package com.k003.nam.Exercise.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++){
            arrayDeque.add(i);
        }

        System.out.println(arrayDeque);
        arrayDeque.addFirst(10);
        arrayDeque.addLast(9);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
    }
}
