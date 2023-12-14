package com.deepdive;

import java.util.Date;

public abstract class GeometricObjectWithoutAbstractMethods {
    private String color = "white";
    private Date createdDate;

    protected GeometricObjectWithoutAbstractMethods(){
        createdDate = new Date();
    }
    protected GeometricObjectWithoutAbstractMethods(String color){
        createdDate = new Date();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
