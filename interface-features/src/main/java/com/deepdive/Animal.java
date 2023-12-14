package com.deepdive;

public interface Animal {
    /**
     * default methods may have block in interfaces. This feature came with Java 8
     * */
    default void makeNoice(){
        System.out.println("Making noice");
    }

    String sound();
}
