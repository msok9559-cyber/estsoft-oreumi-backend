package day11;


import java.util.Arrays;


public class Solution {
    public int[] solution(String S) {
        int[] last = new int[26];
        Arrays.fill(last, -1);

        int[] answer = new int[S.length()];

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            int idx = ch - 'a';
            if(last[idx] == -1){
                answer[i] = -1;
            }else {
                answer[i] = i - last[idx];
            }
            last[idx] = i;
        }
        return answer;


    }
}
