package com.gigame.remote;

public class Remote {
    String color;
    String brand;
    float height;
    float width;

    public Remote(String color, String brand, float height, float width) {
        this.color = color;
        this.brand = brand;
        this.height = height;
        this.width = width;
    }
    public void display(){
        System.out.println("--------------------------------------");
        System.out.println("Color "+color);
        System.out.println("Brand "+brand);
    }
    public void start(){
        System.out.println("Remote Started");
    }
    public void stop(){
        System.out.println("Remote Stopped");
    }
}
