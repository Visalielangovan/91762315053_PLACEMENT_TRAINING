import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {

            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Output: " + new String(arr));
    }

    static boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
