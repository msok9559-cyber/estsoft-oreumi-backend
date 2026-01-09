package day05;

import java.util.Scanner;

public class file03 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        printDivisors(n);
    }
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf(" %d",i);
            }
        }
        System.out.println();
    }
}
