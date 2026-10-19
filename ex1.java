import java.util.Scanner;
public class Lab1Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 1000) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
        long sum = 0;
        int count = 0;
        for (int i = 1000; i >= n; i--) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }
        System.out.println();
        double average = (double) sum / count;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
        scanner.close();
    }
}
