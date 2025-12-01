package day02;

import java.util.Scanner;

public class Example06 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char n1 = input.next().charAt(0);
        switch (n1) {
            case 'a':
            case 'A':
                System.out.println("apple");
                break;
            case 'b':
            case 'B':
                System.out.println("Banana");
                break;
            case 'c':
            case 'C':
                System.out.println("cherry");
                break;
            default:
                System.out.println("fruit");
        }
    }
}
