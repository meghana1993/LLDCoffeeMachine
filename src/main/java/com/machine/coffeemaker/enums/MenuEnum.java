package com.machine.coffeemaker.enums;

import com.machine.coffeemaker.factory.IngredientFactory;
import com.machine.coffeemaker.models.Ingredient;

import java.util.List;

public enum MenuEnum {


    Coffee(1, "Coffee",25.0),
    TEA(2, "TEA",  20.0),
    HOTCHOCOLATE(3, "Hot Chocolate",30.0),
    MILK(4, "Milk", 15.0),
    HOTWATER(5, "Hot Water",  5.0);

    private int id;
    private String name;
    private double price;
    List<Ingredient> listOfIngredients;


    MenuEnum(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.listOfIngredients= IngredientFactory.getIngredients(id);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ingredient> getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(List<Ingredient> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }
}
