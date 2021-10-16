package com.bridgeLabz;
import java.util.Scanner;
import java.lang.Math;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature and wind speed : ");
        int t = sc.nextInt();
        int v = sc.nextInt();
        double w = 0;
        if (v > 3 && v < 120) {
            w = 35.74+(0.6215 * t)+ Math.pow(((0.4275*t) - 35.75)*v, 0.16);
        }
        System.out.println("wind chill will be : " + w);
    }
}
