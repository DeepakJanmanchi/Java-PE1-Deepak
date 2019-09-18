
 
 import java.util.*;

public class Valindrome {

   
    public static int oneDigit(int num) {

        if ((num >= 0) && (num < 10))
            return 1;
        else
            return 0;
    }

    public static int isPalUtil
            (int num, int dupNum) {

        
        if (num == 0) {
            return dupNum;
        } else {
            dupNum = isPalUtil(num / 10, dupNum);
        }

        
        if (num % 10 == dupNum % 10) {
            
            return dupNum / 10;
        } else {
            
            throw new Exception();
        }

    }

    public static int isPal(int num)
            
        if (num < 0)
            num = (-num);

        int dupNum = (num);

        return isPalUtil(num, dupNum);
    }

    public static void sumEven(int n){
        int sum=0;
        while(n>0){
            if((n%10)%2==0){
                sum+=n%10;
            }
            n=n/10;
        }
        if(sum<=25){System.out.println("Sum less than 25 \n");}
        else{
           System.out.println("Sum greater than 25 \n");
        }
    }

    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
            if(isPal(n))
            {
             
            System.out.println("Palindrome"); 
            sumEven(n);
            }
            else{System.out.println("Not Palindrome"); }
        
     }
        
        
    }

