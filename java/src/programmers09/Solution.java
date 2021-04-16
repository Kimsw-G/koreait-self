package programmers09;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String dec = versTernary(n);
        answer = versDec(dec);


        return answer;
    }

    public String versTernary(int dec){
        String ter = "";
        while(dec!=0){
            ter += dec % 3;
            dec /= 3;
        }

        System.out.println(ter);
        return ter;
    }

    public int versDec(String ter){
        int dec = 0;
        do{
            dec += Integer.parseInt(ter.substring(0,1)) * Math.pow(3, ter.length()-1); //첫번째 값 받깅
            ter = ter.substring(1); // 0번째 문자 제외시키기
        }while(ter.length()!=0);

        System.out.println(dec);
        return dec;
    }
}
