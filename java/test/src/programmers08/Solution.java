package programmers08;

public class Solution {
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n]; //체육복 갯수
        for(int i=0;i<n;i++){ //학생 전부를 할당
            student[i] = 1;
        }
        for (int i : lost) {
            student[i-1]--;
        }
        for (int i : reserve) {
            student[i-1]++;
        }

        
        for (int i : student) {
            System.out.print(i+",");
        }

        for(int i=0;i<n-1;i++){
            if(student[i]!=1&&student[i]+student[i+1]==2){ // 비교해서 여분과 분실이 인접할때
                student[i] = 1;
                student[i+1] = 1; 
            }
        }
        System.out.println();
        for (int i : student) {
            System.out.print(i+",");
        }System.out.println();

        for (int i : student) { //0이 아닌 사람 =>체육복이 있는 사람
            if(i!=0) answer++;
        }


        return answer;
    }
}
