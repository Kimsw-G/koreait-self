package programmers01;
public class Main{
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        //속도 측정할 메소드
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Solution s = new Solution();
        System.out.println(s.solution(board, moves));

        
        long et = System.currentTimeMillis();
    
        System.out.println((et - st)+" ms");
    }
}