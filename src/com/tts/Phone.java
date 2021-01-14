package com.tts;

public class Phone {
    private String name;
    private int year;
    private String model;
    private String brand;
    private Boolean sale;
    private String color;

    public Phone(){
        name = "default";
        year = 0;
        model = "default";
        brand = "default";
        sale = false;
        color = "default";
    }

    public Phone(String name, int year, String model, String brand, Boolean sale, String color){
        this.name = name;
        this.year = year;
        this.model = model;
        this.brand = brand;
        this.sale = sale;
        this.color = color;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }
    public String getColor(String color){
        return toString();
    }

    public void setColor(String color) {
        this.color = color;
    }
//    Phone x = new Phone ();

}
