public class ReverseString {
    public static void main(String[] args) {
        String word = "word";
        int wordLength = word.length()-1;
        String newWord = "";
        
        for (int i = wordLength; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        
        System.out.println(newWord);
    }
}
