/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop.cars;

public class Truck extends Car {
    public int weight;
    
    public Truck (int speed, double regularPrice, String color, int weight)
    {
        super(speed,regularPrice,color);
        this.weight = weight;
    }
    
    public double getSalePrice()
    {
        return (weight > 2000) ? regularPrice * 0.9 : regularPrice;
    }
}
