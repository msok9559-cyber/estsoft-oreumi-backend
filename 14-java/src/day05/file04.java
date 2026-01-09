package day05;

import java.util.Scanner;

public class file04 {
    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();
        input.close();

        getArea(radius);
        System.out.printf("Area of the circle with radius %d = %.2f\n", radius, getArea(radius));

    }
    public static double getArea(int radius){

        return Math.PI * radius * radius;
    }
}
