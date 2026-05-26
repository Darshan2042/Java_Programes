package OOP.Interface;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class InBuildFunctionalInterfaces {
    public static void main(String args[]){
        Consumer<Integer> c1 = (a) -> {
            int rev = 0;
            while(a>0){
                int digit = a % 10;
                rev = rev * 10 + digit;
                a = a / 10;
            }
            System.out.println(rev);
        };

        Consumer<String> c2 = (a) -> {
            System.out.println(a.substring(2,6));
        };

        Supplier<Integer> s1 = ()->{
            int[] a = {1,2,3,4,5,6};
            int sum = 0;
            for(int i=0 ; i<a.length ; i++){
                sum += a[i];
            }
            return sum;
        };

        Supplier<String> s2 = () ->{
            String sub = "HelloSir";
            String res = sub.substring(3);
            return res;
        };

        Predicate<Integer> p1 = (a) ->{
            int rev = 0;
            int org = a;
            while(a>0){
                int digit = a % 10;
                rev = rev * 10 + digit;
                a = a/10;
            }
            return org == rev;
        };

        Predicate<String> p2 = (a) ->{
            String org = a;
            StringBuilder sb = new StringBuilder();
            for(int i=a.length()-1 ; i>=0 ; i--){
                char ch = a.charAt(i);
                sb.append(ch);
            }
            String temp = sb.toString();
            return org.equals(temp);
        };

        Function<String,Integer> f1 = (a) ->{
            return a.length();
        };

        Function<Integer,Boolean> f2 = (a) ->{
            if(a < 2){
                return false;
            }
            for(int i=2 ; i*i<=a ; i++){
                if(a % i == 0){
                    return false;
                }
            }
            return true;
        };

        int num = 125;
        c1.accept(num);
        String s = "International";
        c2.accept((s));
        System.out.println(s1.get());
        System.out.println(s2.get());
        int number = 12321;
        System.out.println(p1.test(number));
        String s3 = "abcbd";
        System.out.println(p2.test(s3));
        System.out.println(f1.apply("Lokesh"));
        System.out.println(f2.apply(40));

    }
}
