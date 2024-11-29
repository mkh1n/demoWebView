package com.javafx.demowebview;

public class Suppliers {
    private final int id;
    private String type;
    private String director;
    private String phone;
    private String rating;
    private String name;

    public Suppliers(int id, String type, String director, String phone, String rating, String name) {
        this.id = id;
        this.type = type;
        this.director = director;
        this.phone = phone;
        this.rating = rating;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
