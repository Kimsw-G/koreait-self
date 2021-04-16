package programmers10;

import java.util.ArrayList;

public class Solution {
    public Integer[] solution(int[] arr) {
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int flag = -1;
        for (int i : arr) {
            list.add(i);
            if(flag == i){
                list.remove(list.size()-1);
            }    
            flag = i;
        }

        Integer[] answer = list.toArray(new Integer[0]);
        

        return answer;
    }
}
