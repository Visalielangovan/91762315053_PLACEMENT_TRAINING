import java.util.*;

class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();  

        boolean result;

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            result = false;
        } else {

            int reversedHalf = 0;

            while (x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x = x / 10;
            }

            result = (x == reversedHalf || x == reversedHalf / 10);
        }

        System.out.println(result);
    }
}
