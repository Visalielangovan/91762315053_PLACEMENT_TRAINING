import java.util.Scanner;
public class LC58{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int len=0;
        int i=s.length()-1;

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }

        while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }
        System.out.println(len);

}
}