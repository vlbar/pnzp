package com.vlsu.lab03.carshop.interfaces;

public interface Customer {
    double[] getCarsPrice();
    String[] getCarsColor();
    double getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);
}
