package day04;

import java.util.Scanner;

public class file04 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int max = 0;
        int [] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter an integer: ");
            numbers[i] = input.nextInt();
        }

        input.close();

        max = numbers[0];

        for(int item : numbers){
            sum += item;
            max = Math.max(max, item);
        }

        average = (double)sum / 10;

        System.out.println();

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("max = " + max);


    }
}
