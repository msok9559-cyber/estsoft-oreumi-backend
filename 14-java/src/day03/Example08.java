package day03;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        input.close();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;

        }

        if (count == 2){
            System.out.printf("%d is a prime number\n", n);
        }else {
            System.out.printf("%d is not a prime number\n", n);
        }

    }

}
