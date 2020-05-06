package com.vlsu.lab03;

import com.vlsu.lab03.interfaces.Counter;
import com.vlsu.lab03.impl.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Counter counter;
        Scanner console = new Scanner(System.in);
        
        int x = console.nextInt();
        counter = new DecimalDigitsCount();
        System.out.println("Decimal digits count: " + counter.count(x));
        
        counter = new PrimeFactorsCount();
        System.out.println("Prime factors count: " + counter.count(x));
    }
}