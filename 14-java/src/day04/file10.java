package day04;

public class file10 {
    public static void main(String[] args) {
        final int max = 100;
        final double SQRT_NUM = Math.sqrt(max);
        boolean[] isPrime = new boolean[max + 1];

        for(int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i <= SQRT_NUM; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= max; j += i){
                    isPrime[j] = false;
                }
            }
        }
        System.out.printf("Prime numbers between 2 and %d:\n",max);
        for(int i = 2; i < isPrime.length; i++){
            if(isPrime[i]) System.out.printf("%d ", i);

        }
        System.out.println();
    }
}
