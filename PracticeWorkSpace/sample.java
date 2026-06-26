public class sample{
    public static void main(String args[]){
        int n = 5;
        int count1 = n*(n+1)/2;
        int count2 = 1;
        for(int i = n,i1=1; i >= 1||i1<=n; i--,i1++){
            int c1 = count1;
            int c2 = count2;
            for(int j=i;j>1;j++){
                System.out.print("\t");
            }
            for(int j=i,j1=1; j<=n||j1>=i;j++,j1--){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64));
                System.out.print("\t");
                c1+=j1;
                c2--;
            }
            count1 -= i;
            count2 += i+1;
            System.out.println();
        }
    }
}









/*
Ea  Db  Cd  Bg  Ak
Ic  Hc  Gn  Fi 
Lf  Ki  Jm
Nj  Mn 
Oo
*/