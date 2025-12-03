package day03;

import java.util.Scanner;

public class Example0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the number of columns:");
        int columns = input2.nextInt();
        input.close();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.printf("%4d", num);
                num++;
            }
            System.out.println();
        }

    }
}
