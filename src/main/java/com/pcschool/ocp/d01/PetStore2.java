package com.pcschool.ocp.d01;

public class PetStore2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        
        c1.type = "波斯貓";c1.name = "小花";c1.age = 2;c1.price = 12000;c1.amount = 0;
        c2.type = "波斯貓";c2.name = "柯南";c2.age = 7;c2.price = 500  ;c2.amount = 5;
        System.out.printf("品種: %s 名字: %s 年齡: %d 數量: %d 小計: %,d\n",
                           c1.type, c1.name, c1.age, c1.price, c1.amount, (c1.price*c1.amount));
        System.out.printf("品種: %s 名字: %s 年齡: %d 數量: %d 小計: %,d\n",
                           c2.type, c2.name, c2.age, c2.price, c2.amount, (c2.price*c2.amount));
      
        
    }
    
}
