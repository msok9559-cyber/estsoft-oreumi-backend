package day02;

import java.util.Scanner;

public class Example04 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int max = input.nextInt();
        int min = input.nextInt();
        input.close();
        if (max > min) {
            int sum = max - min;
            System.out.println(sum);
        }else{
            int n1 = min - max;
            System.out.println(n1);
        }
    }
}
