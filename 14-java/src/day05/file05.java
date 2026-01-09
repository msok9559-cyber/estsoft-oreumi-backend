package day05;

import java.util.Scanner;

public class file05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int n =  input.nextInt();
        int n1 = input.nextInt();
        System.out.println();
        input.close();

        System.out.printf("The average of %d and %d = %.2f\n",n,n1,getAverage(n,n1));
    }
    public static double getAverage(int n, int n1){
        return (double)(n + n1) / 2;
    }
}
