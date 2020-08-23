package com.machine.coffeemaker;

import com.machine.coffeemaker.service.CoffeeMakerManager;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CoffeeMakerManager manager = new CoffeeMakerManager();

        while(true) {
            System.out.println("1.Display Menu");
            System.out.println("2.Display Stock Staus");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println(manager.printMenu());
                System.out.println("Choose Beverage:  ");
                int selectedOption = sc.nextInt();

                if(selectedOption >=1 && selectedOption <=5) {
                    manager.prepareBeverage(selectedOption);
                }else{
                    System.out.println("Invalid");
                }
            } else if( input ==2) {
                System.out.println(manager.printStockStatus());
                System.out.println("R Refill");
                System.out.println("Q Exit");
                String selectedOption = sc.next();

                if(selectedOption.equalsIgnoreCase("r")){
                    int selectedIngredient = sc.nextInt();
                    double quantity = sc.nextDouble();

                    double updatedStock = manager.stockUp(selectedIngredient,quantity);
                    System.out.println("Updated Stock == "+ updatedStock);
                }else if( selectedOption.equalsIgnoreCase("q")){
                    break;
                }
            }else{
                System.out.println("Invalid.");
            }

        }





    }
}
