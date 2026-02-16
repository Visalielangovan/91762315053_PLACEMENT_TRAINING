import java.util.*;

class Pillow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     
        int time = sc.nextInt();  

        int cycle = 2 * (n - 1);
        int pos = time % cycle;

        int result;

        if (pos <= n - 1) {
            result = 1 + pos;
        } else {
            result = n - (pos - (n - 1));
        }

        System.out.println(result);
    }
}
