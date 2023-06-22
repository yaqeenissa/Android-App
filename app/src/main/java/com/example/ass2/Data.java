package com.example.ass2;


public class Data {


    private double min ;
    private  double max ;

    public Data(double min, double max){
        this.min=min;
        this.max=max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
