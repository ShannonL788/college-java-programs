public class MathSwitch {
    public static void main(String [] args) {
        int num1 = 9, num2 = 3;
        char ch = '+';
        
        switch(ch){
            case '+' : System.out.println(num1 + num2); break;
            case '-' : System.out.println(num1 - num2); break;
            case '/' : System.out.println(num1 / num2); break;
            case '*' : System.out.println(num1 * num2); break;
        }
    }
}
