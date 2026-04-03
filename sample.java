public class sample{
    public static void main(String args[]){
        int n = 5;
        for(int i=n;i>=1;i--)
        {
            // for(int j=i;j>1;j--){
            //     System.out.print(" ");
            // }
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
1
23
345
4567
56789
*/