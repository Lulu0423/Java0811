package com.pcschool.ocp.d03.school;

public class School {
    public static void main(String[] args) {
        String[][] data = {
            {"john", "18", "170" , "60"},
            {"mary", "17", "160" , "45"},
            {"jane", "17", "165" , "65"},
            {"mark", "19", "180" , "55"},
        };
        
        Student[] students = new Student[data.length];
        for(int i=0;i<data.length;i++) {
            String[] row = data[i];
            String name   = row[0];
            int    age    = Integer.parseInt(row[1]);
            double height = Double.parseDouble(row[2]);
            double weight = Double.parseDouble(row[3]);
            // 建立 BMI 物件
            BMI bmi = new BMI(height, weight);
            // 建立 Student 物件
            Student student = new Student(name, age, bmi);
            // 置入資料
            students[i] = student;
        }
        // 列印 students
        for(Student student : students) {
            System.out.println(student);
        }
        
        for(int i=0 ;i<students.length;i++) {
            System.out.println("---------------------");
            Student s1 = students[i];
            Student s2 = students[i+1];
            students[0] = s2;
            students[1] = s1;
            // 列印 students
            for(Student student : students);
                System.out.println(students);
        }
        
    }
}
