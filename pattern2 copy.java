public class pat14{
    public static void main(String[] args){
        int n=3;
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}