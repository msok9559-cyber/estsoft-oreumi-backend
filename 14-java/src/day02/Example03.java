package day02;

import java.util.Scanner;

public class Example03 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        if (n > 20 && n < 40){
            System.out.println("Dream comes true!");
        }
    }
}
