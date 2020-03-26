/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop.cars;

public abstract class Car {
    public int speed;
    public boolean isSellOut;
    public double regularPrice;
    public String color;
    public abstract double getSalePrice();
    
    public Car(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.isSellOut = false;
        this.regularPrice = regularPrice;
        this.color = color;
    }
}
