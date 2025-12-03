package day03;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int count = 0;

        input.close();

        System.out.printf("Multiples of %d between 1 and %d =",a,b);

        for (int i = 1; i <= a; i++) {
            if (i % b == 0){
                System.out.printf("%d ", i);
                count++;
            }
        }
        System.out.println();
        System.out.printf("Number of multiples of %d = %d\n",b,count);


    }

    }


