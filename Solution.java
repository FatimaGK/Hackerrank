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
//        double median = 0;
//        double mode = 0;
        //calculate mean
        double sum = 0;
        for (int i = 0; i < n; i++) {
            //int add=0;
            sum += x[i];
        }
        System.out.println("Average= "+sum/n);
    }
}
