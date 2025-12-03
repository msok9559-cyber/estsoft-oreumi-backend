package day04;

import java.util.Scanner;

public class file08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] coin = {500, 100, 50, 10};
        int[] coinCount = {10,10,10,10};
        int[] result = new int[4];
        System.out.print("Enter the amount to be repaid:");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < coin.length; i++) {
            int possible = n/coin[i];
            if (possible > coinCount[i]) {
                possible = coinCount[i];
            }
            result[i] = possible;
            n -= possible * coin[i];
        }
        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + " won coins = " + result[i]);
        }
    }
}
