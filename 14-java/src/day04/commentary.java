package day04;

import java.util.Scanner;

public class commentary {
    public static void main(String[] args) {
        ///  강사님 방법
        int n1, n2;
        int gcf =1 ;
        int min;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        System.out.println();
        input.close();

        min = Math.min(n1, n2);

        for (int i = min; i >=1 ; i--){
            if (n1 % i == 0 && n2 % i == 0){
                gcf = i;
                break;
            }
        }
        System.out.printf("The greatest common divisor of %d and %d = %d",n1,n2,gcf);
    }
}
