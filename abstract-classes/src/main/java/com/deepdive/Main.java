package com.deepdive;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Test instantiate abstract class with new operator
        GeometricObject geometricObject = new GeometricObject() {
            @Override
            protected double getArea() {
                return 0;
            }

            @Override
            protected double getPerimeter() {
                return 0;
            }
        };
        //
        /** If you try to new abstract class with new operator you have to implement whole abstract methods.
         * Above, you are not directly instantiating the abstract class GeometricObject. Instead, you are creating an
         * anonymous subclass of GeometricObject and providing implementations for the abstract methods getArea() and getPerimeter().
         * This is a standard way to use abstract classes when you need an instance for one-time use and don't require a full subclass implementation.
         * */

        GeometricObjectWithoutAbstractMethods geometricObjectWithoutAbstractMethods =  new GeometricObjectWithoutAbstractMethods() {
            @Override
            public String getColor() {
                return super.getColor();
            }

            @Override
            public void setColor(String color) {
                super.setColor(color);
            }

            @Override
            public Date getCreatedDate() {
                return super.getCreatedDate();
            }

            @Override
            public void setCreatedDate(Date createdDate) {
                super.setCreatedDate(createdDate);
            }
        };

        /**
         * When you use new with an abstract class, IntelliJ IDEA creates an anonymous subclass. This is because abstract classes cannot be instantiated directly, but you can instantiate an anonymous subclass of the abstract class.
         * Refers to Superclass: The super keyword in this context refers to the superclass GeometricObjectWithoutAbstractMethods.
         * Method Invocation: When you call super.getColor(), you're invoking the getColor() method as implemented in the GeometricObjectWithoutAbstractMethods class.
         * */
    }
}