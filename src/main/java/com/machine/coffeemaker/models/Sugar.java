package com.machine.coffeemaker.models;

import com.machine.coffeemaker.enums.IngredientEnum;

public class Sugar extends Ingredient {

    public Sugar(double quantity) {
        super(IngredientEnum.SUGAR, quantity);
    }
}
