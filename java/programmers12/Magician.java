package programmers12;

public class Magician {
    

    public void run(int n){
        if(n%2==0){//짝수일때!
            evenRun(n);
        }else{//홀수일때!!
            oddRun(n);
        }
        
    }
    
    public void evenRun(int n){//짝수일 경우 실행할 메소드
        int[][] temp = new int[n][n];

        int cnt = 1;

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j)||(i+j==n-1)){
                    temp[i][j] = cnt;
                }
                cnt++;
            }
        }
        cnt = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(temp[i][j]==0){
                    temp[i][j] = cnt;
                }
                cnt++;
            }
        }
        getTable(temp);

    }
    
    public void oddRun(int n){//홀수일 경우 실행할 메소드
        int[][] temp = new int[n][n];
        int row = n-1;
        int column = (n-1)/2;
        
        int cnt = 1; // 넣을 숫자 값
        temp[row][column] = cnt++;
        for(int i = 1;i<n*n;i++){//1은 삽입했으니 1부터 시작
            // 원래 컬럼값을 저장하기
            int row_ = row;
            int column_ = column;
            // 1. 좌, 하로 한 칸씩 이동
            row++;
            column++;
            // 2. 이때 테이블 밖일시? 테이블 안으로 이동
            if(row == n){
                row=0;
            }
            if(column == n){
                column=0;
            }
            // 3. 이때 이 칸에 이미 값이 있다면??
            if(temp[row][column] != 0){ // 원래 값에서 위로 이동!
                row = row_-1;
                column = column_;
            }
            temp[row][column]=cnt++;
        }

        getTable(temp);
    }

    public void getTable(int[][] table){
        for (int[] line : table) {
            for (int num : line) {
                System.out.printf("%d\t",num);
            }
            System.out.println();
        }
    }   
}
