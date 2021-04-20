package programmers04;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution sol = new Solution();


        System.out.println(sol.solution(participant, completion));
    }
}
