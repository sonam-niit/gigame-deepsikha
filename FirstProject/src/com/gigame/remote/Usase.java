package com.gigame.remote;

public class Usase {
    public static void main(String[] args) {
        Remote obj1= new Remote("white","test1",23.45f,45.56f);
        Remote obj2= new Remote("red","test2",23.45f,45.56f);
        Remote obj3= new Remote("white","test2",23.45f,45.56f);
        Remote obj4= new Remote("blue","test3",23.45f,45.56f);

        Remote[] myremotes={obj1,obj2,obj3,obj4};
        for(Remote my: myremotes){
            my.display();
        }
    }
}
