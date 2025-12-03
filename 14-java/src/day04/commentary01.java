package day04;

import java.util.Scanner;

public class commentary01 {
    static void main() {
        final int LENGTH = 30;
        int [] numbers = new int[LENGTH];
        int sum = 0;
        int length = 0;
        double average = 0;
        int aboveAverage = 0;

        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < LENGTH; i++) {
//            System.out.print("Enter an integer:");
//            numbers[i] = input.nextInt();
//
//            if(numbers[i] == 0) {
//                break;
//            }
//            length++;
//            sum += numbers[i];
//        }
        for(; length < LENGTH; length++) {
            System.out.print("Enter an integer: ");
            numbers[length] = input.nextInt();
            if(numbers[length] == 0) break;
            sum += numbers[length];

        }
        input.close();
        average = (double) sum / length;

        for(int i = 0; i < length; i++) {
            if(numbers[i] > average) aboveAverage++;
        }

        System.out.println();
        System.out.println("average = " + average);

        // 평균보다 더큰 정수들의 백분율
        System.out.printf("percentage of number above the average = %g%%\n"
            ,(double) aboveAverage / length * 100);
    }
}
