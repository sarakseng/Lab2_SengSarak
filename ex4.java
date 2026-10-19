package test;

import java.util.Scanner;

public class Lab1Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please give the year");
        int y = input.nextInt();
        System.out.println("please give the month");
        int m = input.nextInt();
        System.out.println("please give the day");
        int d = input.nextInt();
        boolean v = true;
        if (m < 1 || m > 12) {
            v = false;
        } else if (m == 2) {
            boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            if (leap && (d < 1 || d > 29)) { v = false; }
            if (!leap && (d < 1 || d > 28)) { v = false; }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d < 1 || d > 30) { v = false; }
        } else {
            if (d < 1 || d > 31) { v = false; }
        }
        if (v) {
            System.out.println("Output: valid");
        } else {
            System.out.println("Output: invalid");
        }
    }
}
