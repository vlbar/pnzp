package com.vlsu.lab04.primitives;

public class Point {
   private double x;
   private double y;
   
   public Point(double x, double y) {
       this.x = x;
       this.y = y;
   }
   
   @Override
   public String toString() {
       return "Point: " + x + " " + y; 
   }
   
   public double getX() {
       return x;
   }
   
   public double getY() {
       return y;
   }
}
