package imsi;


public class Imsi{
    public static void main(String[] args)  {
        int[] arr = {5,7,89,1,4,6,8};
        
        System.out.println(Amu.getMax(arr));
    }

}

class Amu{

    static int getMax(int[] arr){
        int max=arr[0];

        for (int i : arr) {
            if (max<=i) {
                max = i;
            }
        }
        return max;
    }

    
}