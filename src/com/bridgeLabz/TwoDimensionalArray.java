package com.bridgeLabz;
import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
