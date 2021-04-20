package exam02;


public class Stick {
    //map을 이용해 key-value로 이용하면 더 깔끔히 정리 가능
    int[] needs = {2,3,4,5,6,7};//각각 성냥개비가 들어가는 갯수
    int[] elm = {1,1,1,3,3,1};//위 갯수가 해당하는 숫자의 개수
    int k;
    int result = 0; // 결과값 정리
    int digit;
    int[] digit_box;
    int min_digit, max_digit;
    
    public Stick(int k){
        this.k = k;
        min_digit = k/7;
        if(min_digit<1) min_digit=1;
        max_digit = k/2;
        System.out.println("min_digit : " + min_digit);
        System.out.println("max_digit : " + max_digit);
    }
    
    public void stickMain(){
        for(digit = min_digit; digit <=max_digit; digit ++){
            digit_box = new int[digit]; // 칸 생성
            
            stickCalc(0); //digit자리수만큼 칸 넣기

        }
        
        // System.out.println(total);
        System.out.println("result : "+result);
        digit = 0;
        return;
    }

    public void stickCalc(int digit_cnt){ //처음 들어오면 digit_cnt == 0;이다
        for(int i = 0; i < needs.length; i++){
            digit_box[digit_cnt] = needs[i];
            digit_cnt++;
            if(digit == digit_cnt){//자릿수를 다 채웠을때, 검사를 한다.
                if(k==sumArray(digit_box)){ // 모든 자릿수 합을 검사한다.
                     result += mulArray(digit_box);
                     System.out.println(result);
                     digit_cnt--;
                     continue;
                }else{
                    digit_cnt--;
                }
            }else{
                stickCalc(digit_cnt);
                digit_cnt--;
            }
        }
        
    }
    
    public int sumArray(int[] box){ // 모든 합 더하기
        int total = 0;
        for(int i = 0; i < box.length; i++){
            total += box[i];
        }
        return total;
    }

    public int mulArray(int[] box){ // 모든 합 곱하기
        int total = 1;
        for(int i = 0; i < box.length; i++){
            System.out.print(box[i] + ",");
            total *= elm[box[i]-2];
        }
        if(box[0] == 6 && (digit != 1)){
            return total*2/3;    
        }
        return total;
    }
    
    


}
