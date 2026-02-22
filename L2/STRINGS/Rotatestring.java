import java.util.*;
public class Rotatestring {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        
        if(s.length()!=goal.length()){
            System.out.println(false);
            return;
        }
        String a=s+s;
        if(a.contains(goal)){
            System.out.println(true);
            return;
        }
        System.out.println(false)  ;
    }
}