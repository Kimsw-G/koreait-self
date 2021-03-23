package Exam02;

import jdk.nashorn.api.tree.Tree;

public class Stick {
    //map을 이용해 key-value로 이용하면 더 깔끔히 정리 가능
    int[] needs = {2,3,4,5,6,7};//각각 성냥개비가 들어가는 갯수
    int[] elm = {1,1,1,3,3,1};//위 갯수가 해당하는 숫자의 개수
    int k;
    int total = 0; // 성냥개비 갯수
    int result = 0; // 결과값 정리
    int result_reg = 1;
    int result_ac = 0;
    int digit;
    int[] array;
    int min_digit, max_digit;
    
    public Stick(int k){
        this.k = k;
        min_digit = k/7;
        if(min_digit<1) min_digit=1;
        max_digit = k/2;
        System.out.println(min_digit);
        System.out.println(max_digit);
    }
    
    public void stickMain(){
        for(digit = min_digit; digit <=max_digit; digit ++){
            array = new int[digit]; // 칸 생성
            
            for(int i = 0; i < needs.length; i++){
                stickCheck(array.length,i);
            }
            if(k == sumArr(digit)){//모든 합이 같을때!!

            }

        }
        
        // System.out.println(total);
        System.out.println("result : "+result);
        digit = 0;
        return;
    }
    
    public void stickCheck(int digit_cnt, int i){
        if(digit_cnt == 0){
            return;
        }
        array[digit - digit_cnt] = needs[i]; // digit - digit_cnt 칸에 needs[i]를 넣었음
        if(digit_cnt != 0){
            stickCheck(--digit_cnt);//다음칸에 숫자 넣기
        }
        return;
    }

    public int sumArr(int digit_cnt){ // 값으 모든 합을 더함
        int arraySum = 0;
        for(int i = 0; i < digit_cnt; i++){
            arraySum += array[i];
        }
        return arraySum;
    }


    


}
