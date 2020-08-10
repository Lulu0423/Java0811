package com.pcschool.ocp.tast;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello BMI");
        Scanner sc = new Scanner (System.in);
        System.out.println("請輸入身高");
        double h = sc.nextDouble();
        System.out.println("請輸入體重");
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        System.out.println("身高: %.lf 體重:%.lf BMI:%.2f\n, h,w ");
        
        
    }
    
}
