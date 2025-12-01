package day02;

import java.util.Scanner;

public class Example09 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        long factor = input.nextLong();
        int result = 1;
        for (int i = 1; i <= factor; i++) {
            result *= i;
        }
        System.out.printf("The factorial of %d = %d", factor, result);
    }
}
