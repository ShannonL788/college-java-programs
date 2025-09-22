import java.util.Scanner;

public class DetermineSize {
    public static void main(String [] args) {
        determineSize();
    }
    
    public static void determineSize()
    {
        Scanner scan = new Scanner(System.in);
        
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        
        if(num1 > num2) //if num1 is greater than num2
        {
            System.out.println("Largest = " + num1);
            System.out.println("Smallest = " + num2);
        }
        else if(num1 < num2) //if num1 is smaller than num2
        {
            System.out.println("Largest = " + num2);
            System.out.println("Smallest = " + num1);
        }
        else
        {
            System.out.println("Numbers are the same");
        }
    }
}
