package seats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Seat implements StudentList{

    HashMap<Integer,String> map = new HashMap<Integer,String>();

    public Seat(){ 
        for(int i=0; i<studnet.length; i++){
            map.put(i, studnet[i]);
        }
    }

    public void printLine(){
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.shuffle(keys);
        int cnt=1;
        for (Integer key : keys) {
            System.out.println(cnt + "." + map.get(key));
            cnt++;
        }
    }

    public void chkStudnet(){
        for (String string : studnet) {
            System.out.println(string);
        }
        System.out.println(studnet.length);
        
    }

}
