public class Savings{
   public static void main(String [] args){
       double dailySavings = 0.01;
       double totalSavings = 0.0;
       int days = 0;
       
       while(totalSavings < 200){
           totalSavings += dailySavings;
           dailySavings *= 2;
           days++;
       }
       System.out.println("It will take " + days + " days to save €200");
   }
}
