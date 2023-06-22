package com.example.ass2;

public class Item {
    String titel;
    String value;
    int image;

    public Item(String titel,String value,int image){
        this.titel=titel;
        this.value=value;
        this.image=image;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
