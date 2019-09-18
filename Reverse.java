import java.io.*;
import java.util.*;

public class Reverse{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
       String reverse = "";
       for(int i = s.length() - 1; i >= 0; i--) {
           reverse = reverse + s. charAt(i); 
           
           }
for(int i=0; i<reverse.length(); i++){
    System.out.print(reverse.charAt(i));
}
    }
    
}