
import java.util.Scanner;

public class MostCommonChar{
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       
       String s1 = scan.nextLine();
       int occurances = 0;
       char ch = ' ';
       
       for(int i = 0; i < s1.length(); i++){
           int count = 0;
           for(int j = 0; j < s1.length(); j++){
               if(s1.charAt(i) == s1.charAt(j) && s1.charAt(i) != ' '){
                   count++;
               }
           }
           
           if(count > occurances){
               occurances = count;
               ch = s1.charAt(i);
           }
       }
       System.out.println("The most common character is: " + ch);
       System.out.println(ch + " occurs " + occurances + " times");
   }
}
