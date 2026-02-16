public class pat18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = (char)('E' - i);

            for (char j = ch; j <= 'E'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
