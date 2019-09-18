import java.io.*;
import java.util.*;

public class Detector{
    public static void detective(char c){
        if(Character.isLetter(c)){
         if(Character.isUpperCase(c)){
             System.out.println("Capital Alphabet");
         }
         else {
                         System.out.println("Small Case Alphabet");
 
         }
        }
        else if(Character.isDigit(c)){
                         System.out.println("Digit");

        }
        else {
                         System.out.println("Special Case");

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        detective(c);

    }
}