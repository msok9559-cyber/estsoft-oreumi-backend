package day04;

import java.util.Scanner;

public class file01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        input.close();
        int min = (n1 < n2) ? n1 : n2;

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.printf("The greatest common factor of %d and %d  = %d\n", n1, n2,i);
                break;
            }
        }
    }
}
