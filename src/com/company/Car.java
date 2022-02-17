package com.company;

public class Car {
    private String colorOfCar;
    private String makeOfCar;
    private String modelOfCar;

    //setting method for color
    public void setColorOfCar(String colorOfCar){
        this.colorOfCar = colorOfCar;
    }
    //getter method for color
    public String getColorOfCar() {
        return colorOfCar;
    }
    //setting method for make
    public void setMakeOfCar(String makeOfCar) {
        this.makeOfCar = makeOfCar;
    }
    //getter method for make
    public String getMakeOfCar() {
        return makeOfCar;
    }
    //setting method for model
    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }
    //getter method for model
    public String getModelOfCar() {
        return modelOfCar;
    }
}