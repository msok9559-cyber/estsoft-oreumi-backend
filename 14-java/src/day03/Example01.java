package day03;

public class Example01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}
