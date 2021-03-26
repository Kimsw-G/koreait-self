package programmers05;

import java.util.HashMap;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,Integer> hash = new HashMap<String,Integer>();

        for(String phone : phone_book){
            hash.put(phone, phone.length());
        } // hash 에 phone 값과 phone의 길이를 저장

        for(String phone1 : hash.keySet() ){ //헤드 
            for(String phone2 : hash.keySet()){ // 비교당할 번호
                if(hash.get(phone1) < hash.get(phone2)){ //길이가 길때만 비교,연산
                    if(phone2.startsWith(phone1)){//phone2가 phone1로 시작하는지 검사
                        answer = false;
                    }
                }
            }
            
        }

        return answer;
    }
}
