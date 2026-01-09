package day08;

import java.util.Arrays;
import java.util.Random;

public class file01 {
    public static void main(String[] args) {
        final int LENGTH = 6;
        final int MAX_NUM = 45;
        int[] numbers = new int[LENGTH];
        Random rand = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int num = rand.nextInt(MAX_NUM) + 1;

            if(inArray(numbers, num)) {
                i--;
            }else{
                numbers[i] = num;
            }

        }

        Arrays.sort(numbers);

        System.out.println("numbers =" + Arrays.toString(numbers));


}
    public static boolean inArray(int[] array, int value){
        for(int item : array){
            if(item == value)return true;
        }
        return false;
    }
}




