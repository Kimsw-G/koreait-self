package programmers01;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int leng = board.length;
        int[] basket = new int[leng*leng + 1];
        int cnt = 0;
        int answer = 0; // 없앤 갯수 적기


        for(int i = 0; i < moves.length;i++){
            // 크레인에서 moves[i] 의 값을 가져온다.
            int depth = 0; // 크레인의 깊이 (처음 위치니까 leng(보드 밖))
            while(true){
                System.out.println();
                if(depth == 5) break;
                if(board[depth][moves[i]-1] == 0){ //크레인이 내려갔는데 값이 0(아무것도 없음)
                    depth++;
                }else{
                    basket[cnt] =board[depth][moves[i]-1]; // 이 값을
                    board[depth][moves[i]-1] = 0;
                    cnt++;
                    if(cnt>1){
                        if(basket[cnt-2] == basket[cnt-1]){
                            basket[cnt-2] = 0;
                            basket[cnt-1] = 0;
                            answer+=2;
                            System.out.println("플러스");
                            cnt-=2;
                        }
                    }
                    break; // moves[i] 하나 끝내기
                }
            }
        }

        return answer;
    }
}
