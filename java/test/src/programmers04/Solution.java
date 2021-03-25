package programmers04;

import java.util.HashMap;

public class Solution {
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<Integer,String> hash = new HashMap<Integer,String>();

        for(int i = 0; i < participant.length; i++){
            hash.put(i, participant[i]);
        } // 참가자들을 hashmap에 넣기
        // printHash(hash);

        for(int i = 0; i < completion.length; i++){//완주자 명단만큼 반복하기
            Integer key = getKey(hash, completion[i]); //동일한 value값 확인하여 key 가져오기
            hash.remove(key);//지우기
        }
        for(Integer i : hash.keySet()){ //저장된 key값 확인
            answer = hash.get(i);
        }
        return answer;
    }

    public void printHash(HashMap<Integer,String> hash){
        for(Integer i : hash.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + hash.get(i));
        }
    }

    

    public static <K, V> K getKey(HashMap<K, V> map, V value) { //value값으로 키값 얻기.
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
