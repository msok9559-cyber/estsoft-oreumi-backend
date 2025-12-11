package day10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = s.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}