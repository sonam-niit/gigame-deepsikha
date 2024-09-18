package com.gigame.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
        set.add(null);
        System.out.println(set);
    }
}
