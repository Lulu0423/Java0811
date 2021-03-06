package com.pcschool.ocp.d06.case2.employee;

public class Employee {
    private static final int BASE_SALARY = 2_3800; // 基本薪資
    private int salary;

    public Employee() {
        setSalary(BASE_SALARY);
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int money) {
        if(money > BASE_SALARY) {
            this.salary = money;
        } else {
            this.salary = BASE_SALARY;
        }
    }
    
}
