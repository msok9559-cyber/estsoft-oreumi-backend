package day03;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns:");
        int columns = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                System.out.printf("%4d ", i + j * rows);
            }
            System.out.println();
        }
    }
}
