package day04;

import java.util.Scanner;

public class file05 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int[] number = new int[30];
        int count = 0;
        int max = 0;
        double percentage = 0;
        Scanner input = new Scanner(System.in);
        while (count < 30) {
            System.out.print("Enter number:");
            int num = input.nextInt();
            if (num ==0){
                break;
            }
            number[count] = num;
            count++;
        }
        input.close();
        for (int i = 0; i < count; i++) {
            sum += number[i];
        }
        average = (double) sum / count;
        for (int i = 0; i < count; i++) {
            if (number[i] > max) {
                max++;
            }
        }

        percentage = ((double) max / count) * 100;
        System.out.println();
        System.out.println("average = " + average);
        System.out.println("percentage = " + percentage);
    }
}
