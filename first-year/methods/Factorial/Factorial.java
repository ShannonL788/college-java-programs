import java.util.Scanner;

public class Factorial{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); //starting number
        int m = scan.nextInt(); //ending number
        
        if(n < 0 || m < 0){
            System.out.println("Not Valid!");
        }
        else{
          for(int i = n; i <= m; i++){
                getFactorial(i);
            }
        }
    }
    
    public static void getFactorial(int x){
        int factorial = 1;
        
        for(int j = 1; j <= x; j++){
            factorial *= j;
        }
        System.out.println(factorial);
    }
}
