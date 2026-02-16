import java.util.*;

class Missingnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int expected = n * (n + 1) / 2;
        int actual = 0;

        for(int i = 0; i < n; i++){
            actual += arr[i];
        }

        int missing = expected - actual;
        System.out.println(missing);
    }
}

