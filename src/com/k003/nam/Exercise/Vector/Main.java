package com.k003.nam.Exercise.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 5; i >= 0; i--){
            vector.add(i);
        }
        vector.remove(2);
        System.out.println(vector);
    }
}
