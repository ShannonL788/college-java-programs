import java.util.Scanner;

public class PrimeCount{
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter the number of rows and columns:");
       int rows = scan.nextInt();
       int columns = scan.nextInt();
       
       int [][] nums = new int[rows][columns];
       int count = 0;
       
       System.out.println("Enter the numbers in the array:");
       for(int i = 0; i < rows; i++){
           for(int j = 0; j < columns; j++){
               int num = scan.nextInt();
               
               while(num <= 0){
                   System.out.println("Number is not positive, enter a new number");
                   num = scan.nextInt();
               }
               nums[i][j] = num;
               
               if(isPrime(num)){
                   count++;
               }
           }
       }
       System.out.println("There are " + count + " prime numbers in the array");
   }
   
   public static boolean isPrime(int num){
       if(num <= 1){
           return false;
       }
       for(int i = 2; i <= Math.sqrt(num); i++){
           if(num % i == 0){
               return false;
           }
       }
       return true;
   }
}
