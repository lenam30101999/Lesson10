package com.k003.nam.Exercise.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
    }
}
