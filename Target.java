import java.io.*;
import java.util.*;

public class Target{
    public static void Target(int n, int target){
        Scanner sc = new Scanner(System.in);
        if(n==target){
            System.out.println("Success");
            return;
        }
        
        if(n>target){
            System.out.println("Greater than target, enter the number correctly");
            int z = sc.nextInt();
            Target(z,target);
        }
        else if(n<target){
            System.out.println("Lesser than target, enter the number correctly");
            int z = sc.nextInt();
            Target(z,target);
        }
        
        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int target = 87;
        Target(n,target);

    }
}