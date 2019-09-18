import java.io.*;
import java.util.*;

public class Tthree{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n>=20 && n<=30){
            if(n%2!=0){
                System.out.print("Tom");
            }
            else{
                              System.out.print("Jerry");
  
            }
        }

    }
}