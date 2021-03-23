package Exam02;

public class Stick {
    //map을 이용해 key-value로 이용하면 더 깔끔히 정리 가능
    int[] needs = {2,3,4,5,6,7};//각각 성냥개비가 들어가는 갯수
    int[] elm = {1,1,1,3,3,1};//위 갯수가 해당하는 숫자의 개수
    int k;
    int total = 0;
    static int cnt = 0; //
    int loopKey = 1;
    
    public Stick(int k){
        this.k = k;
    }

    public int stickCalc(){
        cnt = 0;
        int digit = 1;//자릿수 표현
        while(sumTotal(digit)){
            System.out.println(digit);
            digit++;
        }
        return cnt;
    }

    public boolean sumTotal(int digit){
        for(int i = 0; i<needs.length; i++){
            System.out.println(digit + ","+i + ","+cnt);
            System.out.println();
            total += needs[i];
            if(total==k && digit == 1){
                cnt += elm[i];
                total = 0;
                return true;
            }else{
                sumTotal(digit-1);
            }
        }
        return false;
    }

}
