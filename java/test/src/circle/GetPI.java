package circle;

public class GetPI {
    public static void main(String[] args) {
        double x,y;
        int try_ = 0;
        int suc_ = 0;
        while(true){
            x = Math.random();
            y = Math.random();
            try_++;
            // System.out.println(x*x + y*y);
            if(x*x + y*y <= 1.0){
                suc_++;
            }
            if(try_%1000==0) System.out.println(); 
            if(try_==100000)break;
        }

        double k = (double)suc_*4.0/try_;
        System.out.println((double)suc_*4.0/try_);

    }
}
