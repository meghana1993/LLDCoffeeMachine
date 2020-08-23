package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class ChocolatePowder extends Ingredient {

    public ChocolatePowder(double quantity) {
        super(IngredientEnum.CHOCOLATE, quantity);
    }
}
