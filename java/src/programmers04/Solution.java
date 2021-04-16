package programmers04;

import java.util.ArrayList;

public class Solution {
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> list = new ArrayList<String>();

        for(String s : participant){
            list.add(s);
        }
        
        for(String s : completion){
            list.remove(s);
        }
        
        answer = list.get(0);

        return answer;
    }

}
