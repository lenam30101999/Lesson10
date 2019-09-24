package com.k003.nam.Exercise.PriorityDeque;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> listQueue = new PriorityQueue<>();
        listQueue.offer("A");
        listQueue.offer("C");
        listQueue.offer("B");
        listQueue.offer("Y");
        listQueue.offer("G");
        listQueue.offer("*");
        listQueue.offer("0");

        while (true) {
            String character = listQueue.poll();
            if (character != null)
                System.out.println(character);
        }
    }
}
