package day04;

public class file06 {
    static void main() {
        int[] numbers = {1, 3, 4, 3, 1, 3, 4, 1, 2, 3, 1, 3};
        int[] count = new int[5];

        for(int num : numbers ) {
            count[num]++;
        }
        for(int i = 1; i <= 4; i++){
            System.out.print(i + ":");
            for(int j = 0; j < count[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
