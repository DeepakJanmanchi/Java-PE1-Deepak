import java.io.*;
import java.util.*;

public class Vowel{
    public static void vowelUtil(String s){
        int n = s.length();
        for(int i=0; i<n; i++){
            char a = s.charAt(i);
            if(!Character.isLetter(a)){
                System.out.print("Error");
                break;
            }
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                System.out.print("Vowel ");
            }
            else {
                System.out.print("Consonant ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        vowelUtil(s);

    }
}