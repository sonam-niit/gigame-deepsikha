package com.gigame.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student(1,"deepsikha"));
        list.add(new Student(2,"sonam"));
        System.out.println(list);
    }
}
