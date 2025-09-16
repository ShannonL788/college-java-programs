import java.util.Scanner;

public class Swap{
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter radius");
       double radius = scan.nextInt();
       System.out.println("Enter 1 for area of circle, 2 for circumference");
       int num = scan.nextInt();
       
       if(num == 1){
           double area = 3.14159 * Math.pow(radius, 2);
           System.out.println(area);
       }
       else if(num == 2){
           double circumference = 3.14159 * (radius * 2);
           System.out.println(circumference);
       }
   }
}
