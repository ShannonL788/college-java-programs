import java.util.Scanner;

public class Palindromes{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        
        if(isPalindrome(s1)){
            System.out.println(s1 + " is a palindrome");
        }
        else{
            System.out.println(s1 + " is NOT a palindrome");
        }
    }
    
    public static boolean isPalindrome(String s1){    
        String reverse = new String("");
        char ch;
        
        for(int i = 0; i < s1.length(); i++)
        {
            ch = s1.charAt(i); 
            reverse = ch + reverse;
        }
      
        if(s1.equalsIgnoreCase(reverse))
        {
            String upperT = s1.toUpperCase(); //convert to uppercase
            return true;
        }
        return false;
    }
}
