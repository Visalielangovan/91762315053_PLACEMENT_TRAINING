
    import java.util.*;

class Solution {

    public int lastRemaining(int n) {

        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {

            if (left || remaining % 2 == 1) {
                head = head + step;
            }

            remaining = remaining / 2;
            step = step * 2;
            left = !left;
        }
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        Solution obj = new Solution();
        System.out.println(obj.lastRemaining(n));
    }
}


