public class perfectsquare {
    boolean perfectSquarecheck(int n){
        if (n<0){
            return false;
        }
        else{
            for(int i=1;i*i<=n;i++){
                if(i*i == n)
                    return true;
            }
            return false;
        }
    }

    public static void main(String args[]){
        perfectsquare p1 = new perfectsquare();
        System.out.println(p1.perfectSquarecheck(144));
    }
    
}
