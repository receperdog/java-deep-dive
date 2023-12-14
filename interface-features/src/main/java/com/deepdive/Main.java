package com.deepdive;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.println(tiger.sound());
        /**
         * makeNoice is a default method. It is implemented in interface thanks to Java 8 feature.
         * */
        tiger.makeNoice();
    }
}