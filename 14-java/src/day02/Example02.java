package day02;

import java.util.Scanner;

public class Example02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();
        int quotient = n1/n2;
        int remainder = n1%n2;
        System.out.println("Quotient =" + quotient);
        System.out.println("Remainder =" + remainder);
    }
}
