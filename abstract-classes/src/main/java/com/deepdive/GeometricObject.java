package com.deepdive;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private Date createdDate;

    protected GeometricObject(){
        createdDate = new Date();
    }
    protected GeometricObject(String color){
        createdDate = new Date();
        this.color = color;
    }
    protected abstract double getArea();
    protected abstract double getPerimeter();
}
