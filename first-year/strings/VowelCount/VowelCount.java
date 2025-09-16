public class VowelCount{
    public static void main(String [] args){
        String s1 = "programming";
        int vowelCount = 0;
        int nonVowelCount = 0;
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
            else{
                nonVowelCount++;
            }
        }
        System.out.println(vowelCount + " vowels");
        System.out.println(nonVowelCount + " non vowels");
    }
}
