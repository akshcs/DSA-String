package StringPart1;

public class ReverseString {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder out = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            String word = words[i].trim();
            if(!word.isEmpty()){
                if(out.length()!=0){
                    out.append(" ");
                }
                out.append(word);
            }
        }
        return out.toString();
    }
}
