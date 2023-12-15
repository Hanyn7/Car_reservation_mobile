package com.example.mini_projet;

public class CarClass {
    private String name;
    private String description;
    private String brand;
    private String image;
    private String key;

    public CarClass(String name, String description, String brand, String image) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.image = image;
    }

    public CarClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
