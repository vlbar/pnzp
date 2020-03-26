/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop.cars;

public class Ford extends Car {
    public int year;
    public int manufacturerDiscount;
    
    public Ford (int speed, double regularPrice, String color, int year, int manufacturerDiscount)
    {
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice()
    {
        return regularPrice - manufacturerDiscount;
    }
}
