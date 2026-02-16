import java.util.*;

class Maximum69 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   

        char[] arr = String.valueOf(num).toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }

        int result = Integer.parseInt(new String(arr));
        System.out.println(result);
    }
}
