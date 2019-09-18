import java.io.*;
import java.util.*;
class Sum{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of arguments: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        int sum = 0;
        int z = 0;
        for(int i=1; i<=n; i++){
         z = sc.nextInt();
         sum += z;
        }
       System.out.print(sum);

    }
}