package programmers03;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length;i++){
            // System.out.println();
            // for(int j = 0; j < 3; j++){
            int n = commands[i][1] - commands[i][0] +1;
            int[] imsiArr = new int[n]; // 새롭게 자른 배열의 길이
            int flag = commands[i][0]-1;
            for(int k = 0; k < n; k++){//안에 자른 값 넣어주기!
                imsiArr[k] = array[flag];
                flag++;
            }
            Arrays.sort(imsiArr); // 나온 값을 정렬
            answer[i] = imsiArr[commands[i][2]-1];//answer에 값 넣어주기!
            // }
        }

        return answer;
    }
}
