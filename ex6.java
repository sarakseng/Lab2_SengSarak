package test;

import java.util.Scanner;

public class Lab1Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
        double math = input.nextDouble();
        double english = input.nextDouble();
        double physics = input.nextDouble();
        double programming = input.nextDouble();
        double max = math;
        double min = math;
        if (english > max) { max = english; }
        if (physics > max) { max = physics; }
        if (programming > max) { max = programming; }
        if (english < min) { min = english; }
        if (physics < min) { min = physics; }
        if (programming < min) { min = programming; }
        System.out.print("Max score is: " + (int)max + " (");
        boolean firstMax = true;
        if (math == max) { System.out.print("Math"); firstMax = false; }
        if (english == max) { if (!firstMax) System.out.print(" and "); System.out.print("English"); firstMax = false; }
        if (physics == max) { if (!firstMax) System.out.print(" and "); System.out.print("Physics"); firstMax = false; }
        if (programming == max) { if (!firstMax) System.out.print(" and "); System.out.print("Programming"); }
        System.out.println(" courses).");
        System.out.print("Min score is: " + (int)min + " (");
        boolean firstMin = true;
        if (math == min) { System.out.print("Math"); firstMin = false; }
        if (english == min) { if (!firstMin) System.out.print(" and "); System.out.print("English"); firstMin = false; }
        if (physics == min) { if (!firstMin) System.out.print(" and "); System.out.print("Physics"); firstMin = false; }
        if (programming == min) { if (!firstMin) System.out.print(" and "); System.out.print("Programming"); }
        System.out.println(" course).");
        double avg = (math + english + physics + programming) / 4.0;
        System.out.println("Average score of this student is: " + avg);
    }
}
