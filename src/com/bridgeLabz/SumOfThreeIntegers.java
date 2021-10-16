package com.bridgeLabz;
import java.util.Scanner;
public class SumOfThreeIntegers {
    static int COUNT = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int x=0;x<n;x++){
            arr[x] = sc.nextInt();
        }
        for (int i=0;i<(arr.length - 2);i++){
            for (int j=i+1;j<(arr.length - 1);j++){
                for (int k=j+1;k<(arr.length);k++){
                    if ( arr[i] + arr[j] + arr[k] == 0 ){
                        COUNT = COUNT + 1;
                        System.out.println(i + " " + j + " " + k);

                    }
                }
            }
        }
        System.out.println("number of sets : " + COUNT);
    }
}
