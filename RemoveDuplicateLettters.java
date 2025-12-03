
import java.util.HashSet;

public class RemoveDuplicateLettters{
    public static void main(String args[]){
        String str = "cbacdcbc";
        char[] str1 = str.toCharArray();

        HashSet<Character> hs = new HashSet<>();
        for(char c : str1){
            hs.add(c);
        }
        System.out.println(hs);
    }
}