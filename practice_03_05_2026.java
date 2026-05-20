import java.util.*;
public class practice_03_05_2026{
    public static boolean  isprime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // int n = 123456;
        // int rev = 0;
        // while(n > 0){
        //     int digit = n % 10 ;
        //     rev = rev * 10 + digit;
        //     n = n/10;
        // }
        // System.out.println(rev);

        // int n = 12351;
        // int rev = 0;
        // int org = n;
        // while ( n > 0){
        //     int digit = n % 10;
        //     rev = rev *10+ digit;
        //     n = n / 10;
        // }
        // System.out.println(org==rev);

        // int n = 1234569;
        // int count = 0;
        // while( n > 0){
        //     int digit = n %10;
        //     count++;
        //     n = n / 10;
        // }
        // System.out.println(count);

        // int n = 12345;
        // int sum = 0;
        // while(n > 0){
        //     int digit = n % 10;
        //     sum += digit;
        //     n = n/10;
        // }
        // System.out.println(sum);

        // int n = 1235;
        // int pro = 1;
        // while(n > 0){
        //     int digit = n % 10;
        //     pro *= digit;
        //     n = n/10;
        // }
        // System.out.println(pro);

        // int n = 123466;
        // int digit = n % 10;
        // if(digit % 2 == 0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("odd");
        // }


        // int  a = 50;
        // int b = 60;
        // System.out.println("a = "+a+"b= "+b);
        // a = a+b;
        // b = a-b;
        // a = a-b;
        // System.out.println("a = "+a+"b= "+b);


        // check if a number is prime

        // int  n = 15;
        // boolean b = true;
        // if(n <=1){
        //     b = false;
        // }
        // for(int i=2 ; i*i<=n ; i++){
        //     if(n % i==0){
        //         b = false;
        //         break;
        //     }
        // }
        // System.out.println(b);

        // int n=13;
        // int count = 0;
        // for(int i=1;i<=n;i++){
        //     if( n%i ==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println("Given Number is Prime");
        // }
        // else{
        //     System.out.println("Given Number is not a prime NUmber");
        // }

        // int n = 13;
        // for(int i= 2 ; i<=n;i++){
        //     if(isprime(i)){
        //         System.out.print(i+" ");
        //     }
        // }

        // int n = 13;
        // int count = 0;
        // for(int i= 2 ; i<=n;i++){
        //     if(isprime(i)){
        //         System.out.print(i+" ");
        //         count++;
        //     }
        // }
        // System.out.println();
        // System.out.println(count);


        // int n = 10;
        // for(int i=1 ; i<=n ; i++){
        //     if( n % i == 0){
        //         System.out.print(i+" ");
        //     }
        // }

        // int n = 10;
        // int sum = 0;
        // for(int i=1 ; i<n ; i++){
        //     if( n % i == 0){
        //         sum +=i;
        //     }
        // }
        // System.out.print(n==sum);

        // Find GCD of Two numbers

        // int a = 12;
        // int b = 18;
        // int gdc = 1;
        // for (int i=1 ; i <= Math.min(a,b);i++){
        //     if(a % i ==0 && b % i == 0){
        //         gdc = i;
        //     }
        // }
        // System.out.println(gdc);

        // Find LCM of Two numbers
        // int a = 12;
        // int b = 16;
        // int max = Math.max(a,b);
        // while(true){
        //     if(max % a == 0 && max % b ==0){
        //         System.out.println(max);
        //         break;

        //     }
        //     max++;
        // }

        //Compute factorial of a number
        // int n = 5;
        // int fact = 1;
        // for(int i=1 ; i <= n ; i++){
        //     fact *= i;
        // }
        // System.out.println(fact);

        //Check strong number
        // int n = 145;
        // int org = n;
        // int sum = 0;
        // while(n >0){
        //     int digit = n % 10;
        //     int fact = 1;
        //     for(int i=1 ; i<=digit ; i++){
        //         fact *= i;
        //     }
        //     sum += fact;
        //     n = n/10;
        // }
        // System.out.println(org==sum);

        // Check Armstrong Number
        // int n = 377;
        // int org = n ;
        // int length = 0;
        // int sum = 0;
        // while(n >0){
        //     int digit = n % 10;
        //     length++;
        //     n = n / 10;
        // }
        // int temp = org;
        // while(temp>0){
        //     int digit = temp % 10;
        //     sum += Math.pow(digit, length);
        //     temp /= 10;
        // }
        // System.out.println(org==sum);

        //Check Neon number
        // int n = 9;
        // int sum =0;
        // int square = n *n;
        // while(square > 0){
        //     int digit = square % 10;
        //     sum += digit;
        //     square /= 10;
        // }
        // if(n == sum){
        //     System.out.println("neon Number");
        // }else{
        //     System.out.println("Not a Neon Number");
        // }

        // Check Happy number
        // int n = 19;
        // while(n != 1 && n != 4){
        //  int sum = 0;
        //  while(n > 0){
        //     int digit = n % 10;
        //     sum += digit * digit;
        //     n /= 10;
        // }
        // n = sum;
        // }
        // if(n == 1){
        //     System.out.println("Happy Number");
        // } else {
        //     System.out.println("Not a Happy Number");
        // }

        //Check Harshad (Niven) number
        // int n  = 18;
        // int org = n;
        // int sum = 0;
        // while(n > 0){
        //     int digit = n % 10;
        //     sum += digit;
        //     n /= 10;
        // }
        // if (org % sum ==0){
        //     System.out.println("Harshad Number");
        // }
        // else{
        //     System.out.println("Not a Harshad Number");
        // }

        // Find largest digit in a number
        // int n = 1578;
        // int largest  = n% 10;
        // while( n > 0){
        //     int digit = n % 10;
        //     if(largest < digit)
        //             largest = digit;
        //     n /=10;
        // }
        // System.out.println(largest);


        //Find smallest digit

        // int n = 56987;
        // int small = n% 10;
        // while(n > 0){
        //     int digit = n % 10;
        //     if(small > digit)
        //         small  = digit;
        //     n /= 10;
        // }
        // System.out.println(small);

        //Count frequency of digits
        // int n = 122333;
        // String s = String.valueOf(n);

        // int[] freq = new int[10];

        // for(int i = 0; i < s.length(); i++){
        //     int digit = s.charAt(i) - '0';
        //     freq[digit]++;
        // }

        // for(int i = 0; i < 10; i++){
        //     if(freq[i] > 0){
        //         System.out.println(i + " -> " + freq[i]);
        //     }
        // }
    }   

}