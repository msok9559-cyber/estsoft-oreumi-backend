package day02;

import java.util.Scanner;

public class Example11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        int n = input.nextInt();
        System.out.println();
        input.close();

        for(int i =1; i <= n; i*= 10){
            System.out.printf("%d's digit = %d\n",i,n/i %10);
        }
    }
}
