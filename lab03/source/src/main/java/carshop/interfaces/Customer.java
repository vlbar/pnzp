/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop.interfaces;

public interface Customer {
    double[] getCarsPrice();
    String[] getCarsColor();
    double getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);
}
