package day04;

public class file09 {
    static void main() {
        final int num = 100;
        boolean isPrime = true;
        double sqrt;

        System.out.printf("Prime numbers between 2 and %d:\n",num);

        for (int i = 2; i <= num; i++) {
            isPrime = true;

            sqrt = Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");

        }
        System.out.println();




    }
}
