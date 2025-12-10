package day09;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner input = new Scanner(System.in);

        while (true) {
            try{
                System.out.print("Enter two positive integers: ");
                n1 = input.nextInt();
                n2 = input.nextInt();
                if ( n1 <= 0 || n2 <= 0 ){
                    throw new IllegalArgumentException("Numbers must be positive");
                }
                break;
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Try again.");
            }
        }
        Gcd gcdObj = new Gcd();
        int gcd = gcdObj.calcGcd(n1, n2);

        int lcm = n1 * n2 / gcd;

        System.out.printf("GCD(%d, %d) = %d\n", n1, n2, gcd);
        System.out.printf("LCM(%d, %d) = %d\n", n1, n2, lcm);

        input.close();
    }
}
