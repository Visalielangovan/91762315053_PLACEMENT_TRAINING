import java.util.*;

class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();   

        int w = 1;

        for(int i = 1; i * i <= area; i++){
            if(area % i == 0){
                w = i;
            }
        }

        int l = area / w;

        System.out.println(l + " " + w);
    }
}
