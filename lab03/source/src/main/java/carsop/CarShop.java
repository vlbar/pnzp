/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsop;

import carshop.impl.MyOwnAutoShop;
import java.util.Scanner;
import java.util.Arrays;

public class CarShop {
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = new MyOwnAutoShop();
        Scanner console = new Scanner(System.in);
       
        System.out.println("Welcome to CarShop! Here is our assortment:");
        
        int carChoice = 0;
        do {
            System.out.println("We have " + autoShop.getCarsCount() + " cars!");
            System.out.println("Which car do you want to see? (0 to see all)");
            carChoice = console.nextInt();
            if(carChoice == 0)
            {
                System.out.print("Prices: " + autoShop.getCarsPrice().toString());
                System.out.print("Colors: " + autoShop.getCarsColor().toString());
            }
            else
            {
                System.out.print("Price: " + autoShop.getCarPrice(carChoice));
                System.out.print("Color: " + autoShop.getCarColor(carChoice));
                System.out.print("Do you want ot buy this car? (1 - yes, 0 - no)");
                int buyChice = console.nextInt();
                if(buyChice == 1)
                {
                    if(autoShop.purchaseCar(carChoice))
                    {
                        System.out.print("Okay! Now this car is yours! A successful ride!");
                    }
                    else
                    {
                        System.out.print("Oh sorry... This car is alredy bought, sadness...");
                    }
                }
            }
       }
       while (carChoice != -1);
   }
}
