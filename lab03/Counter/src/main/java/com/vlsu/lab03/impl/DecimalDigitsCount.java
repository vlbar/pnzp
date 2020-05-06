package com.vlsu.lab03.impl;

import com.vlsu.lab03.interfaces.*;

public class DecimalDigitsCount implements Counter {
    
    public int count(int number) {
        int result = (number == 0) ? 1 : 0;
        while (number != 0) {
            result++;
            number /= 10;
        }
        return result;
    }
}
