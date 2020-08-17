package com.pcschool.ocp.d06;

import java.util.Arrays;

public class Calc {
    public int add(int... values) {
       int sum = 0;
       for(int x : values) {
           sum += x;
       }
       return sum;
    }
}
