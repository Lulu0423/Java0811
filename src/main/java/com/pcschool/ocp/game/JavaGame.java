package com.pcschool.ocp.game;

import java.util.Scanner;

public class JavaGame {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("Java Game");
            System.out.println("--------------");
            System.out.println("1.猜數字");
            System.out.println("2.猜字母");
            System.out.println("9.離開");
            System.out.println("--------------");
            System.out.print("請選擇 ==> ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: // 1.猜數字
                    numberGameLoop();
                    break;
                case 2: // 2.猜字母
                    englishGameLoop();
                    break;
                case 9: // 9.離開
                    return; // run()方法結束
            }
            System.out.println("按下Enter 鍵繼續....");
            new Scanner(System.in).nextLine();
        }
    }

    public static void englishGameLoop() {
        English english = new English();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入英文字: ");
            int userAns = sc.next().toUpperCase().charAt(0);
            int result = english.check(userAns);
            if (result == 0) {
                System.out.println("恭喜答對了");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: 猜 %s 了\n",
                        english.getCount(), result > 0 ? "大" : "小");
                //continue;
            }
        }
    }

    public static void numberGameLoop() {
        Number number = new Number();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入數字: ");
            int userAns = sc.nextInt();
            int result = number.check(userAns);
            if (result == 0) {
                System.out.println("恭喜答對了");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: 猜 %s 了\n",
                        number.getCount(), result > 0 ? "大" : "小");
                //continue;
            }
        }
    }
}
