package com.machine.coffeemaker.service;

import com.machine.coffeemaker.enums.MenuEnum;

import java.awt.*;
import java.util.Map;

public interface CoffeeMakerService{

    Map<Integer, Double> getStockStatus();
    MenuEnum[] getMenu();

    boolean dispenseBeverage(int bevId);
    boolean canBeverageBeDispensed(int bevId);
    double stockUp(int selectedIngredient , double toUpQuantity);
}
