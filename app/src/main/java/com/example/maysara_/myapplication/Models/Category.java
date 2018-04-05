package com.example.maysara_.myapplication.Models;

public class Category {
    private int id;
    private String name;
    private int budget;
    private int limit;

    public Category(String name, int budget, int limit) {
        this.name = name;
        this.budget = budget;
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
