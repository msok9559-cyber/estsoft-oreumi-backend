package day07;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int korean = 0;
        int math = 0;
        int english = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);


        while (true) {
            try {

                System.out.print("Enter korean score; ");
                korean = input.nextInt();

                System.out.print("Enter Math score: ");
                math = input.nextInt();

                System.out.print("Enter English score: ");
                english = input.nextInt();
                System.out.println();
                if(korean <= 0 || math <= 0 || english <= 0){
                    throw new NegativeScoreException();
                } else if (korean > 100 || math > 100 || english > 100) {
                    throw new InvalidSoreException();
                }
                average = (double)(korean + math + english) / 3;
                System.out.println("Average :" + average);
                break;

            } catch (NegativeScoreException | InvalidSoreException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
        input.close();
    }
}
