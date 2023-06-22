package com.example.ass2;



public class Person {

    private double height;
    private  double weight;

    public Person(){

    }
    public Person(double height,double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double calculateBMI(double height ,double weight){

        double h=height/100;
        return weight / (h * h);
    }
}
