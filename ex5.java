package test;

import java.util.Scanner;

public class Lab1Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        System.out.print("All prime numbers from 2 to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
