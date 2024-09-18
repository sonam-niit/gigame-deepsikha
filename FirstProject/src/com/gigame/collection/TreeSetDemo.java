package com.gigame.collection;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
//        set.add(null); //not allow null values
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
        Iterator<Integer> it= set.descendingIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
