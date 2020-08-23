package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class Water extends Ingredient {

    public Water(double quantity) {
        super(IngredientEnum.WATER, quantity);
    }
}
