package day03;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        int weight;
        int bags = 0;
        int max3kg = 0;
        int remain;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of a bag:");
        weight = input.nextInt();
        System.out.println();

        input.close();

        max3kg = weight / 3;
        for (int i = 0; i <= max3kg; i++) {
            remain = weight - i * 3;

            if (remain % 5 == 0) {
                bags = i = remain / 5;

                break;
            }
        }

        if (bags > 0){
            System.out.printf("Cheolsu will need to bring %d bags. \n", bags);
        }else {
            System.out.printf("Cheolsu cannot take %d kg of sugar. \n", weight);
        }
    }
}
