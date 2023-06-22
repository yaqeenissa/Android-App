package com.example.ass2;


import java.util.ArrayList;

public class BMI {
    private ArrayList<Data> list=new ArrayList<>();
    private  double bmi;

    public BMI(ArrayList<Data> list ) {

    }

    public BMI() {

    }
    public ArrayList<String> getRanges() {
        ArrayList<String> ranges = new ArrayList<>();
        ranges.add("0.0 - 18.5");
        ranges.add("18.6 - 24.9");
        ranges.add("25.0 - 29.9");
        ranges.add(">= 30.0");
        return ranges;
    }

    public ArrayList<Data> getList() {
        return list;
    }

}
