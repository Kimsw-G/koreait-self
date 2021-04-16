package programmers11;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        

        // 효율성 문제록 기각!
        // for(int i=2; i<=n; i++){
        //     for(int j=2; j<=i; j++){
        //         if(i%j == 0){
        //             if(i==j){
        //                 answer++;
        //                 break;
        //             }else{
        //                 break;
        //             }
        //         } 
        //     }
        // }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=n;i++){
            list.add(i);
        }

        while(!list.isEmpty()){
            Integer[] iArr = list.toArray(new Integer[0]);
            Integer[] jArr = list.toArray(new Integer[0]);

            for (Integer i : iArr) {
                for (Integer j : jArr) {
                    if(i!=j && j%i==0){ //배수 삭제하기
                        list.remove(j);
                    }
                }
            }
            list.remove(0);
            answer++;
        }
        
        return answer;
    }
}
