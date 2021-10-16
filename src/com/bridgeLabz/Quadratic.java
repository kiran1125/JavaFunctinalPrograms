package com.bridgeLabz;
import java.lang.Math;
import java.util.Scanner;

public class Quadratic {
    public static double ROOT_1 = 0;
    public static double ROOT_2 = 0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta=0;
        delta =Math.pow(b,2)-4*a*c;
        ROOT_1 = (-b+Math.sqrt(delta/(2*a)));
        ROOT_2 = (-b-Math.sqrt(delta/(2*a)));
        System.out.println("first Root value is : " + ROOT_1);
        System.out.println("Second root value is : " + ROOT_2);

    }
}

