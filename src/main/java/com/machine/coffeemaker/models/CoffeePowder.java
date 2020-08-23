package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class CoffeePowder extends Ingredient {

    public CoffeePowder(double quantity) {
        super(IngredientEnum.COFFEE, quantity);
    }
}
