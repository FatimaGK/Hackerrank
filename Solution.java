package math;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("please specify array length");
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("please enter all numbers of the array");
        String strArr = input2.nextLine();
        String[] StrNumbers = new String[myInt];

        int[] numbers = new int[myInt];
        StrNumbers = strArr.trim().split(" ");
        for (int i = 0; i < myInt; i++) {
            numbers[i] = Integer.parseInt(StrNumbers[i]);
        }
        calculate(numbers, myInt);
    }

    public static void calculate(int[] x, int n) {
        //sort whole array
        int tmp;
        for (int a = 0; a < n - 1; a++) {
            for (int i = a + 1; i < n; i++) {
                if (x[a] > x[i]) {
                    tmp = x[a];
                    x[a] = x[i];
                    x[i] = tmp;
                }
            }
        }
        //calculate mean
        double sum = 0;
        for (int i = 0; i < n; i++) {
            //int add=0;
            sum += x[i];
        }
        System.out.println("Average= " + sum / n);

        //calculate median
        double median = 0;
        if (n % 2 == 0) {//if array has even number of numbers
            for (int i = 0; i < n; i++) {
                median = ((double) x[n / 2] + (double) x[n / 2 - 1]) / 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                median = x[(n - 1) / 2];
            }
        }
        System.out.println("Median= " + median);
        //calculate mode
        int maxCount = 0;
        int mode = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if (x[i] == x[y]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    mode = x[i];
                }
            }

        }
        System.out.println((double)mode);
    }
}
