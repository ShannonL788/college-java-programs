import java.util.Scanner;

public class StartVowel{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        
        char ch = s1.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(s1);
        }
        else{
            System.out.println("Does not start with vowel");
        }
    }
}
