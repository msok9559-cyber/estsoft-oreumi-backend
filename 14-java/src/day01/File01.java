package day01;

public class File01 {
    static void main() {
        int value = 100;
        double factor = 0.98;
        char grade = 'A';
        System.out.println("Value: " + value);
        System.out.println("Factor: " + factor);
        System.out.println("Grade: " + grade);

        // 객체의 printf 메서드로 출력방법
        System.out.printf("Value: %d, Factor: %.2f, Grade: %c\n", value, factor, grade);
    }
}