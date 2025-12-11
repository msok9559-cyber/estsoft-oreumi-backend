package day10;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor ) {
        int[] answer = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] result = s.solution(arr, divisor);
        System.out.println(Arrays.toString(result));
    }
}
