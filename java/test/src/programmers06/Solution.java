package programmers06;

import java.util.Arrays;

public class Solution {
    int students[][] = {
        {1,2,3,4,5},//5개
        {2,1,2,3,2,4,2,5},//8개
        {3,3,1,1,2,2,4,4,5,5}//10개
    };


    public int[] solution(int[] answers) {
        
        int[] scoreBox = new int[students.length]; // 점수 박스 만들기
        int max = 0;//최고점 체크!

        for(int i = 0; i < answers.length;i++){
            if(answers[i]==students[0][i%5]) scoreBox[0]++;
            if(answers[i]==students[1][i%8]) scoreBox[1]++;
            if(answers[i]==students[2][i%10]) scoreBox[2]++;
        } // 값을 BOX에 저장
        System.out.println(Arrays.toString(scoreBox));//점수 출력!
        max = getMax(scoreBox);
        int[] answer = new int[getHonorCnt(max, scoreBox)]; 
        int cnt = 0;
        for(int i=0; i<scoreBox.length;i++){// 어쨌든 여기가 문제임?
            if(scoreBox[i]==max) {
                answer[cnt] = i+1;
                cnt++;
            }
        }

        return answer;
    }

    public int getMax(int[] box){
        int max = box[0];

        for(int i=1; i<box.length; i++){
            if(box[i]>max) max = box[i];
        }
        return max;
    }
    public int getHonorCnt(int max,int[] box){
        int cnt = 0;
        for(int i=0; i<box.length;i++){
            if(box[i] == max) {
                cnt++;
            }
        }
        return cnt;
    }

}
