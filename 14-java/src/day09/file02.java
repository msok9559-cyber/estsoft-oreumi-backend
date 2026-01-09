package day09;


import java.util.Scanner;

public class file02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");
        int num = input.nextInt();
        System.out.println();
        input.close();

        System.out.printf("%dth Fibonacci number = %d\n", num, fibonacci(num));

    }
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


