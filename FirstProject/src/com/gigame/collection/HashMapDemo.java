package com.gigame.collection;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"sonam");
        map.put(2,"deppsikha");
        map.put(1,"test"); //no key duplicates
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
