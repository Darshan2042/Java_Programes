import java.util.ArrayList;
class EvenOrOdd{
    public void check(int num){
        Boolean p = false;
        if(num % 2 == 0){
            p = true;
        }

        if(p){
            System.out.println("Number is Even: "+num);
        }
        else{
            System.out.println("Number is Odd: "+num);
        }

    }

    public void range(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0 ; i<=num ; i++){
            if(i % 2 == 0){
                arr.add(i);
            }
            else{
                arr1.add(i);
            }
        }
        System.out.println("All the Even Numbers in the range of: "+arr);
        System.out.println("All the Odd Numbers in the range of: "+arr1);


    }
    public static void main(String args[]){
        EvenOrOdd o = new EvenOrOdd();
         o.check(121);
         o.range(50);
    }
}