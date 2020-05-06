package com.vlsu.lab03.carshop.impl;

import com.vlsu.lab03.carshop.interfaces.*;
import com.vlsu.lab03.carshop.cars.*;  

public class MyOwnAutoShop implements Admin, Customer {
    private double income;
    private Car[] cars;
    
    public MyOwnAutoShop()
    {
         cars = new Car[5];
         cars[0] = new Sedan(190, 450000, "White", 5);
         cars[1] = new Ford(210, 1430000 ,"Blue", 2020, 30000);
         cars[2] = new Ford(290, 1400000, "Gray", 2015, 10000);
         cars[3] = new Truck(177, 3000000, "Metal", 2000);
         cars[4] = new Truck(180, 5500000, "Red", 7200);
    }
    
    public double getIncome()
    {
        return income;
    }
    
    public int getCarsCount()
    {
        return cars.length;
    }
    
    public double[] getCarsPrice()
    {
        double[] prices = new double[cars.length];
        for(int i = 0; i < cars.length; i++)
        {
            prices[i] = getCarPrice(i);
        }
        return prices;
    }
    
    public String[] getCarsColor()
    {
        String[] colors = new String[cars.length];
        for(int i = 0; i < cars.length; i++)
        {
            colors[i] = getCarColor(i);
        }
        return colors;
    }
    
    public double getCarPrice(int id)
    {
        if(id >= 0 && id < cars.length)
        return cars[id].getSalePrice();
        else return 0;
    }
    
    public String getCarColor(int id)
    {
        if(id >= 0 && id < cars.length)
            return cars[id].color;
        else 
            return "none";
    }
    
    public boolean purchaseCar(int id)
    {
        if(id >= 0 && id < cars.length)
        if(!cars[id].isSellOut)
        {
            cars[id].isSellOut = true;
            income += getCarPrice(id);
            return true;
        }
        return false;
    }
}
