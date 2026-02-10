import java.util.Scanner;

public class LC242 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        int[] count = new int[26];

       
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

      
        for (int c : count) {
            if (c != 0) {
                System.out.println("false");
                return;
            }
        }

       
        System.out.println("true");
    }
}
