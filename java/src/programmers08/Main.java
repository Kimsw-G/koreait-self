package programmers08;


public class Main {
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 5;
        int[] lost = {1,3};
        int[] reserve = {5,2};

        System.out.println(sol.solution(n,lost,reserve));
    }


}
