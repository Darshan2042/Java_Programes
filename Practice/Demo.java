package Practice;

public class Demo {
    boolean checkPrime(int n){
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    boolean checkPalindrome(int n){
        int temp =n,rev=0;
        while(temp>0){
            int digit =  temp%10;
            rev = rev *10+digit;
            temp /= 10;
        }
        return rev==n;
    }

    boolean checkPerfectSquare(int n){
        if(n<0)
            return false;
        for(int i=1;i*i<=n;i++){
            if(i*i == n)
                return true;
        }
        return false;
        
    }

    boolean checkPerfectCube(int n){
        if(n<0)
            return false;
        for(int i=1;i*i*i<=n;i++){
            if(i*i*i == n)
                return true;
        }
        return false;
        
    }


    boolean checkArmstrong(int n){
        int temp = n,count = 0,sum= 0;
        while(temp>0){
            count++;
            temp /= 10;
        }
        int t = n;
        while(t>0){
            int digit = t % 10;
            sum += Math.pow(digit,count);
            t /= 10;
        }
        return n==sum;
    }

    int reverseNumber(int n){
        int rev=0;
        while(n >0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n /= 10; 
        }
        return rev;
    }
    int findNthNumber(int num){
        int count = 0,n=0;
        while(true){
            if(checkPerfectCube(n) && checkPerfectSquare(n)){
                count++;
                if(count == num){
                    break;
                }
            }
            n++;
        }
        return n;
    }


    boolean checkSumOfDigitContains(int n){
        int temp = n,sum=0;
        while (temp>0){
            sum += temp%10;
            temp /= 10;
        }
        int div = 1;
        int s = sum;
        while(s > 0){
            div *= 10;
            s /= 10;
        }
        int num = n;
        while(num > 0){
            if(num % div == sum){
                return true;
            }
            num /= 10;
        }

        return false;

    }
    public static void main(String args[]){
        Demo d1 = new Demo();
        System.out.println(d1.checkSumOfDigitContains(5410));
    }
}
