class Score {
    public int scoreOfString(String s) {
        char arr[] = s.toCharArray();
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++){
            max += Math.abs(arr[i+1] - arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new Score().scoreOfString(s));
    }
}
