package day02;

import java.util.Scanner;

public class Example07 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
    }
}
