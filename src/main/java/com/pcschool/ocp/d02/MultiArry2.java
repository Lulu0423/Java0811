package com.pcschool.ocp.d02;

public class MultiArry2 {
    public static void main(String[] args) {
        int[][] x = {{100, 90, 80}, {70, 60, 50}};
        System.err.println("x length = " + x.length);
        //將 x[0] 的內容取出
        for (int i = 0; i < x[0].length; i++) {
            System.out.println(x[0][i]);
        }
        //將 x[1] 的內容取出
        for (int i = 0; i < x[1].length; i++) {
            System.out.println(x[1][i]);
        }
            
    }        
        
}       
     
