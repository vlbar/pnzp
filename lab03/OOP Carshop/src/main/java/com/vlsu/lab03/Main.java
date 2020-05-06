package com.vlsu.lab03;

import com.vlsu.lab03.carshop.impl.MyOwnAutoShop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = new MyOwnAutoShop();
        Scanner console = new Scanner(System.in);
       
        System.out.println("Welcome to CarShop! Here is our assortment:");
        
        int carChoice = 0;
        do {
            System.out.println("We have " + autoShop.getCarsCount() + " cars!");
            System.out.println("Which car do you want to see? (0 to see all, -1 to exit)");
            carChoice = console.nextInt();
            if(carChoice == 0)
            {
                System.out.println("Prices: " + Arrays.toString(autoShop.getCarsPrice()));
                System.out.println("Colors: " + Arrays.toString(autoShop.getCarsColor()));
            }
			else if(carChoice == -1)
			{
				System.out.println("Goodbeye! Come back again and we will give you a discount!");
			}
            else
            {
                System.out.println("Price: " + autoShop.getCarPrice(carChoice - 1));
                System.out.println("Color: " + autoShop.getCarColor(carChoice - 1));
                System.out.println("Do you want ot buy this car? (1 - yes, 0 - no)");
                int buyChoice = console.nextInt();
                if(buyChoice == 1)
                {
                    if(autoShop.purchaseCar(carChoice))
                    {
                        System.out.println("Okay! Now this car is yours! A successful ride!");
                    }
                    else
                    {
                        System.out.println("Oh sorry... This car is alredy bought, sadness...");
                    }
                }
            }
       }
       while (carChoice != -1);
   }
}
