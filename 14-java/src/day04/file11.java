package day04;

import javax.xml.transform.Source;

public class file11 {
    static void main() {
        int[][] numbers = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = i * 4 + j + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
