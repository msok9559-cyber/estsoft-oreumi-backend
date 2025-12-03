package day04;

import java.util.Scanner;

public class file07 {
    public static void main(String[] args) {
        int LENGTH = 10;
        int [] numbers = new int[LENGTH];
        int [] numbers2 = new int[LENGTH];
        int count = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < LENGTH; i++){
            System.out.print("Enter a positive integer: ");
            numbers[i] = input.nextInt();
        }
        for(int i = 0; i < LENGTH; i++){
            numbers2[i] = numbers[i] % 19;
        }
        for(int i = 0; i < LENGTH; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < LENGTH; j++){
                if(numbers[i] == numbers2[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                count++;
            }
        }
        System.out.printf("Number of different remainders is %d.\n",count);

    }
}
