package imsi;

public class Imsi{
    public static void main(String[] args) {
        // int 😊 = 5; 안 됨
        String str = "!";
        char tmp = str.charAt(0);
        
        System.out.println(tmp>=33 && tmp<=44);
        str = str.replace(Character.toString(tmp), "");
        System.out.println(str);
    }
}