
import java.util.HashMap;
import java.util.Map;

public class MapUsage {
    public static void main(String args[]){
        Map<Character,Integer> mp = new HashMap<>();
        String s = "succsess";
        for(int i = 0;i < s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(mp);
        int count = 0;
        int maxVowelFrequency = 0;
        int maxConsonentFrequency = 0;


        
        
    }
}
