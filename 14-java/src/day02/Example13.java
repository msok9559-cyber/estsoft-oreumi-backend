package day02;

import java.util.Scanner;

public class Example13 {
    static void main() {
        int num;
        long f0 = 0;
        long f1 = 1;
        long fibo = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer greater than 1: ");
        num = input.nextInt();
        input.close();
        for (int i = 2; i <= num; i++) {
            fibo = f0 + f1;
            f0 = f1;
            f1 = fibo;
        }
        System.out.printf("%dth Fibonacci number = %d\n", num, fibo);
    }
}
