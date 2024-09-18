package com.gigame.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
        set.add(null);
        set.add(null); //duplicates
        System.out.println(set);
    }
}
