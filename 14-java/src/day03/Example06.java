package day03;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tree height:");
        int a = input.nextInt();
        System.out.print("Enter the height that riese juring the day:");
        int b = input.nextInt();
        System.out.print("Enter the sliding height at night:");
        int c = input.nextInt();
        int day = 0;
        int height = 0;
        while (true){
            day++;
            height += b;
            if (height >= a){
                break;
            }
            height -= c;
        }
        System.out.printf("It takes %d for snail climb the tree\n",day);
    }
}
