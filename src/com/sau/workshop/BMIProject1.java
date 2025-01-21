package com.sau.workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) throws IOException {

        String empName;
        double weight, height, bmi;

        Scanner sc = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++");
        System.out.print("Input your name : ");
        empName = sc.next();
        System.out.print("Input your weight (kg) : ");
        weight = sc.nextDouble();
        System.out.print("Input your height (m) : ");
        height = sc.nextDouble();

        bmi = weight / height * height;

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI of  is " + bmi);
        InputStreamReader input = new InputStreamReader(System.in);
        System.out.println("++++++++++++++++++++++++++");

    }

}
