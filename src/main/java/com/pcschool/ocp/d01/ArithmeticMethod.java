package com.pcschool.ocp.d01;

import java.util.Random;

public class ArithmeticMethod {

    public static void main(String[] args) {
        char[] poker = "A234567890JQK".toCharArray();
        // shuffle 洗牌
        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            int from = r.nextInt(poker.length);
            int to = r.nextInt(poker.length);
            char c = poker[from];   // 先記住 poker[0] 的資料, 並放在變數 c 中
            poker[from] = poker[to]; // 將 poker[1] 的資料給 poker[0]
            poker[to] = c;        // 最後變數 c 的資料給 poker[1]
        }
        //列印
        for (char p : poker) {
            System.out.print(p + "");
        }
        System.out.println();
    }
}
