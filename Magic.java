import java.io.*;
import java.util.*;

public class Magic{
    public static void magic(int n){
        int z = n;
       String s = Integer.toString(n);
       int l = s.length();
       int a[] = new int[l];
       for(int i=0; i<l; i++){
           a[i]= n%10;
           n=n/10;

       }
       int sum=0;
               Arrays.sort(a); 
               for(int i=l-1; i>=0; i--){
                   if(a[i]%2==0){
                    sum += a[i];
                   }
                   
          System.out.print(a[i]);

       }
       System.out.print("Sum of even numbers is: " + sum);
       if(sum>25){
           System.out.print(" True");
       }
       else{
                     System.out.print(" False");
 
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        magic(n);

    }
}