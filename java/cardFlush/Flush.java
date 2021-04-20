package cardFlush;

import java.util.ArrayList;

public class Flush {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public Flush(int n){
        for(int i=n;i>0;i--){
            list.add(i);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("================");
    }

    public int run(){
        while(list.size()!=1){
            list.remove(list.size()-1);
            list.add(0,list.remove(list.size()-1));
        }
        return list.get(0);
    }
}
