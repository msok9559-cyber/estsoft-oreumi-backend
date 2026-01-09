package day10;

import java.util.Scanner;

public class file02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the episode number to check :");
        int episodeNumber = input.nextInt();
        input.close();


        int number = 0;
        int count = 0;
        for ( ; ;   number++) {
            if (String.valueOf(number).contains("666"))count++;
            if(count == episodeNumber){
                break;
            }
        }
            System.out.printf("The number included int the %d th episode title = %d\n", episodeNumber, number);
    }
}
