import java.util.*;

class Missingnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] arr = new int[n + 1];
        List<Integer> list = new ArrayList<>();

       
        for (int i = 0; i < n; i++) {
            arr[nums[i]] = 1;
        }

        
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                list.add(i);
            }
        }

       
        System.out.println(list);
    }
}
