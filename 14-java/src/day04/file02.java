package day04;

import java.util.Scanner;

public class file02 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers :");
        n1 = input.nextInt();
        n2 = input.nextInt();
        input.close();
        while(n2 != 0){
            int n3 = n1%n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.printf("The greatest common factor = %d\n", n1);
    }
}
