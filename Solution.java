package math;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;import java.util.*;

import static math.MMM.calculate;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        int[] numbers = new int[myInt];
        for (int i = 0; i < myInt; i++) {
            numbers[i] = input.nextInt();
        }

        input.close();
        calculate(numbers, myInt);
    }


}
