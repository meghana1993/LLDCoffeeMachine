package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class Ingredient {

    private IngredientEnum ingredient;
    private double quantity;

    public Ingredient(IngredientEnum ingredientName, double quantity) {
        this.quantity = quantity;
        this.ingredient = ingredientName;
    }

    public IngredientEnum getIngredient() {
        return ingredient;
    }

    public void setIngredient(IngredientEnum ingredient) {
        this.ingredient = ingredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
