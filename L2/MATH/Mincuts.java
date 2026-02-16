import java.util.*;

class Mincuts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int result;

        if(n == 0 || n == 1){
            result = 0;
        }
        else if(n % 2 == 0){
            result = n / 2;
        }
        else{
            result = n;
        }

        System.out.println(result);
    }
}
