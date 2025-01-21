package com.sau.workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) throws IOException {

        String empName;
        double weight, height, bmi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name : ");
        empName = sc.next();
        System.out.print("Input your weight : ");
        weight = sc.nextDouble();
        System.out.print("Input your height : ");
        height = sc.nextDouble();

        System.out.println("--------------------------");

        bmi = weight / height * height;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Your name " + empName);
        System.out.println("Your weight (kg) : " + weight);
        System.out.println("Your height (m) : " + height);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI of  is " + bmi);InputStreamReader input = new InputStreamReader(System.in);
        System.out.println("++++++++++++++++++++++++++");

    }

}
