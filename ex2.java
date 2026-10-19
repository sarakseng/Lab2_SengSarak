package test;

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        double delta = b*b - 4*a*c;

        //check validation
        if(a == 0) {
            double x = (-c/(double)b);
            System.out.println("This equation is not a quadratic formula, but x = " + x);
        }else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("The root of the equation is X1 = " + x1 + ", X2 = " + x2);
            }
            if (delta == 0) {
                double x = (-b/2*a);
                System.out.println("The root of the equation is x = " + x );
            }
            if (delta < 0) {
                System.out.println("The equation has no real root.");
            }
        }
    }
}
