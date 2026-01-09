package day05;

import java.util.Scanner;

public class file02 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite number :");
        num = sc.nextInt();
        System.out.println();
        sc.close();

        ///System.out.printf("Your favorite number is %d\n", num);

        printNumber(num);
    }
    public static void printNumber(int num) {
        System.out.printf("Your favorite number is %d\n", num);
    }
}
