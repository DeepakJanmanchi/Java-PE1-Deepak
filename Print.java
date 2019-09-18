import java.io.*;
import java.util.*;

public class Print{
    public static void printSeries(int n){
        for(int i=1; i<=n ; i++){
            for(int z=1; z<=i; z++){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printSeries(n);

    }
}