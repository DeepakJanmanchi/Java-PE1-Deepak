


import java.io.*;
import java.util.*;

public class Extra{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String extra = "";
        for(int i = s.length()-n; i<s.length(); i++){
            extra = extra + s.charAt(i);
        }
        for(int i=1; i<=n; i++){
            s = s + extra;
        }
       for(int i=0; i<s.length(); i++){
           System.out.print(s.charAt(i));
        } 
        System.out.println();
    }
    
}