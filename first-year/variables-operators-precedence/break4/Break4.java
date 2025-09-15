public class Break4 {
  public static void main(String [] args){
    int num = 2016;

    int digit1 = num / 1000;
    int digit2 = (num / 100) % 10;
    int digit3 = (num / 10) % 10;
    int digit4 = num % 10;

    System.out.println("The first digit is " + digit1);
    System.out.println("The second digit is " + digit2);
    System.out.println("The third digit is " + digit3);
    System.out.println("The fourth digit is " + digit4);
  }
}
