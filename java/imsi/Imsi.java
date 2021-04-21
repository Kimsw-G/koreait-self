package imsi;


public class Imsi{
    public static void main(String[] args)  {
        int[] arr = new int[10];
        long num = 1613461572;

        int length = (int)(Math.log10(num)+1);

        for(int i=0;i<length;i++){
            int temp = (int)(num%10); // 가장 첫자리 저장
            num /= 10; // 가장 앞자리 죽이기
            arr[temp]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}

