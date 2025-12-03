package day03;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter two integers:");
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0 && b == 0)  {
                System.out.println("Good bye!");
                break;
            }
            sum = a + b;
            System.out.printf("%d + %d = %d\n",a,b,sum);
        }


    }
}
