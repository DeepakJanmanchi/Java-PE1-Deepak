import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        while(true) {
            System.out.println();
            System.out.println("1:Palindrome \t 2: Tom n Jerry in 20s \t 3:Vowel n Consonant \n 4:Iteration \t 5:Sum of Integers \t" +
                    "6:Indentify Char \t 7:Sort Integer \n 8:Guess Number \t 9:Reverse String \t 10:String Repeat \t 11:Exit");
            System.out.println("Select an option:-");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            String dummy[] = {};
            switch (num){
                case 1:
                    Palindrome q1 = new Palindrome();
                    q1.palindrome();
                    break;
                case 2:
                    
                    Tthree.main(dummy);
                    break;
                case 3:
                    Vowel q3 = new Vowel();
                    q3.main(dummy);
                    break;
                case 4:
                    Print.main(dummy);
                    break;
                case 5:
                    Sum.main(dummy);
                    break;
                case 6:
                    Detector.main(dummy);
                    break;
                case 7:
                    Magic.main(dummy);
                    break;
                case 8:
                    Target.main(dummy);
                    break;
                case 9:
                    Reverse.main(dummy);
                    break;
                case 10:
                    Extra.main(dummy);
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Enter a valid Choice");
            }
        }
    }
}
