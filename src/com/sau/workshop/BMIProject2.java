package com.sau.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String name;
        double weight, height, bmi;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++");
        System.out.print("Input your name : ");
        name = reader.readLine();
        System.out.print("Input your weight (kg) : ");
        weight = Double.parseDouble(reader.readLine());
        System.out.print("Input your height (m) : ");
        height = Double.parseDouble(reader.readLine());

        bmi = weight / height * height;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("BMI of " + name + " is " + df.format(bmi));
        System.out.println("++++++++++++++++++++++++++");


    }
}
