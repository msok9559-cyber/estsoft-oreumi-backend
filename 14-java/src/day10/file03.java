package day10;

import java.util.Scanner;

public class file03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five card numbers : ");
        int[] cards = new int[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = input.nextInt();
        }
        input.close();

        int maxSum = 0;
        int[] bestCombo = new int[3];
        int bestSize = 0;


        for (int i = 0; i < 5; i++) {
            int sum = cards[i];
            if (sum <= 21 && sum > maxSum) {
                maxSum = sum;
                bestCombo = new int[]{cards[i], 0, 0};
                bestSize = 1;
            }


            for (int j = i + 1; j < 5; j++) {
                sum = cards[i] + cards[j];
                if (sum <= 21 && sum > maxSum) {
                    maxSum = sum;
                    bestCombo = new int[]{cards[i], cards[j], 0};
                    bestSize = 2;
                }


                for (int k = j + 1; k < 5; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (sum <= 21 && sum > maxSum) {
                        maxSum = sum;
                        bestCombo = new int[]{cards[i], cards[j], cards[k]};
                        bestSize = 3;
                    }
                }
            }
        }


        if (maxSum == 0) {
            System.out.println("Fail");
        } else {
            System.out.print("card = ");
            for (int i = 0; i < bestSize; i++) {
                System.out.print(bestCombo[i] + " ");
            }
            System.out.println();
            System.out.println("Sum = " + maxSum);
        }
    }
}