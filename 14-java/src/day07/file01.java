package day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class file01 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Korean score: ");
        int Korean = input.nextInt();

        System.out.println("Enter Math score: ");
        int Math = input.nextInt();

        System.out.println("Enter English score: ");
        int English = input.nextInt();



        try {
            if (Korean < 0 || Math < 0 || English < 0){
                throw new NegativeScoreException();
            }
            double average = (Korean + Math + English) / 3.0;

            System.out.println("Average score: " + average);
        }catch (NegativeScoreException e){
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);

        }catch(InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            // 입력 스트림은 닫는 문장같은 경우는 finally에 꼭넣어두기
            input.close();
        }



    }
}
