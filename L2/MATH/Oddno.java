import java.util.*;

class Oddno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.next();   

        String result = "";

        for(int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if(digit % 2 != 0) {
                result = num.substring(0, i + 1);
                break;
            }
        }

        System.out.println(result);
    }
}
