package com.gigame.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo {
    public static void main(String[] args) {
        //ArrayList<String> arr= new ArrayList();
        LinkedList<String> arr=new LinkedList<>();
        arr.add("user2");
        arr.add("testing");
        arr.add("user1");
        System.out.println(arr);
        for(String str : arr)
            System.out.println(str);
        //Iterator to iterate collection objects
        Iterator<String> str= arr.iterator();
        while (str.hasNext())
            System.out.println(str.next());
        //List also return listIterator which iterates in both direction
        ListIterator<String> itr= arr.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Backward");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        System.out.println(arr.contains("user1"));
        System.out.println(arr.size());
        System.out.println(arr.remove("testing"));
        System.out.println(arr);
    }
}
