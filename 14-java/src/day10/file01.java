package day10;

import java.util.Scanner;

public class file01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the episode number to check : ");
        int episodeNumber = input.nextInt();
        input.close();

        int count = 0;
        int number = 0;

        while(true){
            number++;

            if(String.valueOf(number).contains("666")){
                count++;
            }
            if (count == episodeNumber){
                break;
            }

        }

        System.out.printf("The number included int the %d th episode title = %d\n", episodeNumber, number);
    }
}
