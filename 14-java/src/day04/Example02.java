package day04;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        while(true){
            num = input.nextInt();
            if(num == 0){
                break;
            }
            System.out.printf("Binary number for decimal %d = %s\n\n",
                    num, Integer.toBinaryString(num));
        }

    }
}
