import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String args[]){
        // Map<Character,Integer> mp = new HashMap<>();
        String s = "leetcode";
        // for(int i = 0;i < s.length();i++){
        //     mp.put(s.charAt(i), i);
        // }

        // System.out.println(mp);
        Map<Character,Integer> mp1 = new HashMap<>();
        for(char c : s.toCharArray()){
            mp1.put(c , mp1.getOrDefault(c, 0)+1);
        }
        System.out.println(mp1);


        for(int i = 0;i < s.length();i++){
            if(mp1.get(s.charAt(i)) == 1){
                System.out.println(i);
                // break;
            }
        }


        
    }
}
