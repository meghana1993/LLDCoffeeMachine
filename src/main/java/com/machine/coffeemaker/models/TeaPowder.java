package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class TeaPowder extends Ingredient {

    public TeaPowder(double quantity) {
        super(IngredientEnum.TEA, quantity);
    }
}
