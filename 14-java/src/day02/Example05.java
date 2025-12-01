package day02;

import java.util.Scanner;

public class Example05 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        if(n1 % n2 == 0){
            System.out.printf("%d is a multiple of %d", n1, n2);
        } else if (n2 % n1 == 0) {
            System.out.printf("%d is a multiple of %d", n1, n2);
            
        }else{
            System.out.printf("%d is not a multiple of %d", n1, n2);
        }
    }
}
