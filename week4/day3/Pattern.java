package week4.day3;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
    	int n = 3; // number of rows in the pattern
        int i, j;

        // print the first half of the pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);

                // print * if it is not the last number in the row
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println(); // move to the next line
        }
        for (i = n-1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);

                // print * if it is not the last number in the row
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println(); // move to the next line
        }
    }
}


