package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class Milk extends Ingredient {

    public Milk(double quantity) {
        super(IngredientEnum.MILK, quantity);
    }
}
