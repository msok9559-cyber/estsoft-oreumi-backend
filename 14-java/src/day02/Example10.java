package day02;

import java.util.Scanner;

public class Example10 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hourly wage :");
        int hourlyWage = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the hours worked :");
        int work = input2.nextInt();

        int pay = 0;

        if (work < 8) {
            pay = work * hourlyWage;
        }else if (work > 8) {
            int normalPay = 8 * hourlyWage;
            int overtime = (work - 8) * (int)(hourlyWage * 1.5);
            pay = normalPay + overtime;
        }
        System.out.printf("Today's wage is %d won.",pay);
    }
}
