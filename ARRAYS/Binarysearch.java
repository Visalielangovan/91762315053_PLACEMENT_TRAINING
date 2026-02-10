import java.util.Scanner;
public class Binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target=sc.nextInt();
         int low=0; int high=n-1;
         if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at  "+mid);
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            System.out.println("-1");
         }
    }
}