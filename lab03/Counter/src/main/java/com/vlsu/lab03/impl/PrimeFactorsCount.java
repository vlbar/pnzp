package com.vlsu.lab03.impl;

import com.vlsu.lab03.interfaces.Counter;

public class PrimeFactorsCount implements Counter {
    public int count(int number) {
        int result = 0;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                if(isPrime(i)) {
                    result++;
                }
            }
        }
        return result;
    }
    
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
