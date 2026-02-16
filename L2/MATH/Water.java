import java.util.*;

class Water {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBottles = sc.nextInt();   // user input
        int numExchange = sc.nextInt();  // user input

        int total = 0;
        int empty = 0;

        while (numBottles > 0) {
            total += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        System.out.println(total);
    }
}
