import java.util.Scanner;

public class CompareStrings{
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       
       String s1 = scan.nextLine();
       String s2 = scan.nextLine();
       
       if(s1.equals(s2)){
           System.out.println("Exactly the same: True");
       }
       else{
           System.out.println("Exactly the same: False");
           
           if(s1.equalsIgnoreCase(s2)){
               System.out.println("Similar: True");
           }
           else{
               System.out.println("Similar: False");
           }
       }
   }
}
