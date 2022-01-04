package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double weight;
        double height;
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao= (m)");
        height = scanner.nextDouble();
        System.out.println("Nhập cân nặng= (kg)");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}
