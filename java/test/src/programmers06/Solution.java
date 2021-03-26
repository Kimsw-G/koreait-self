package programmers06;


import java.util.TreeSet;

public class Solution {
    public int solution(int[] nums) {// 1~10000의 짝수개의 배열
        System.out.print("");

        int answer = 0;
        int[] myBox = new int[nums.length/2]; // n/2개만큼 myBox를 만듬
        TreeSet<Integer> list = new TreeSet<Integer>(); //도감(새로 받은 포켓몬들을 저장)
        
        for(int i = 0,j = 0; j < myBox.length && i < nums.length;i++,j++){ // i랑 j를 같이 돌림
            if(list.add(nums[i])){ // 새로 가져온 포켓몬을 도감에 저장
                myBox[j] = nums[i]; // 내 박스에[j] 폰박사님 포켓몬[i] 할당
            }else{
                j--;
            }
        }
        answer = list.size();
        return answer;
    }
}

