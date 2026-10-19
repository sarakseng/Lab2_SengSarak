package test;

import java.util.Scanner;

public class Lab1Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int min, max;
        System.out.println("Input 5 numbers: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        min = n1;
        max = n1;
        if (n2 < min) { min = n2; }
        if (n2 > max) { max = n2; }
        if (n3 < min) { min = n3; }
        if (n3 > max) { max = n3; }
        if (n4 < min) { min = n4; }
        if (n4 > max) { max = n4; }
        if (n5 < min) { min = n5; }
        if (n5 > max) { max = n5; }
        System.out.println("Among all the five input numbers (" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " and " + n5 + "), min is " + min + " and max is " + max + ".");
    }
}
