package day02;

import java.util.Scanner;

public class Example01 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of a circle as an integer: ");

        int radius = input.nextInt();
        double pi = 3.141592;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("pi ="+ pi);
        System.out.println("radius of the circle =" +radius);
        System.out.printf("area of the circle = %.3f\n" ,area);
        System.out.printf("circumference of the circle = %.3f\n",circumference);
    }
}
