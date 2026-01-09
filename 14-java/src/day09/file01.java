package day09;

import java.util.Scanner;

public class file01 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");

        int num = input.nextInt();
        System.out.println();
        input.close();
        System.out.printf("Factorial %d = %d\n",num,factorial(num));



    }
    public static long factorial(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
        //조건연산자로  간단하게 작성
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}
