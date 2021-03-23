package Exam01;

import java.util.Random;

public class Calc {
    int price;
    int n = 10; //주어진 날의 수
    int[] p = new int[n];//n번째날 생산량
    int[] c = new int[n];//n번째날 주문량
    // int n = 6;
    // int[] p = {5,4,7,2,0,6};
    // int[] c = {4,6,4,9,2,3};
    int amount = 0; //탁구공 재고량
    int day = -1; // 날짜(-1부터 시작. calc 호출시 1씩 증가)
    int cash = 0; // 매출량

    public Calc(int price){
        Random rand = new Random();
        this.price = price; // 메인에서 받아온 PRICE값을 통해 탁구공 가격 책정

        for(int i = 0; i < n; i++){
            p[i] = rand.nextInt(100)+1;
            c[i] = rand.nextInt(200)+1;
        }
    } //함수 생성과 함께 p값과 c값을 랜덤으로 주기

    public int calc(int price){
        day++;//하루 경과!
        System.out.println(day + "일"+amount+"개"+cash+"원"+price+"원");
        if(price<25 || day == n){
            return 0;//현재까지 번 돈 / 경과일. 평균 일 수익
        }
        amount += p[day]; // 전일 재고량 + 금일 생산량
        if(amount>=c[day]){ // 주문량 할당 완료시
            cash += c[day]*price;
            amount -= c[day];
            calc(this.price);
        }else{ // 주문 할당 실패시!
            calc(price/2);//값을 1/2로 낮추어 호출하기
        }
        return cash/(day);
    }
}
