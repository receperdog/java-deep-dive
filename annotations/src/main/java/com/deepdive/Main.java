package com.deepdive;

@RequestForEnhancement(id = 1, engineer = "test", synopsis = "test", date = "test")
public class Main {
    public static void main(String[] args) {
        /*
          Following method will print following output to the console:

          RequestForEnhancement Details:
          ID: 1
          Synopsis: test
          Engineer: test
          Date: test
         */
        RuntimeAnnotationProcessor.processClassAnnotations(Main.class);

    }
}