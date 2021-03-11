package ru.geekbrains.entity;

public class Product {
    private int id;
    private String name;
    private double cost;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Product(){}

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
