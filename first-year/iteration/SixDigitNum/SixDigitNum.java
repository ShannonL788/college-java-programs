import java.util.Scanner;

public class SixDigitNum{
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a 6-digit integer");
       int num = scan.nextInt();
       
       while(num > 99999 && num < 1000000){
           System.out.println("Enter a 6-digit integer");
           num = scan.nextInt();
       }
       System.out.println("Program ended. Input was not a 6-digit number.");
   }
}
