public class SeperateLetters{
    public static void main(String [] args){
        String s1 = "I drink tea";
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch != ' '){
                System.out.println(ch);
            }
        }
    }
}
