import java.util.Arrays;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        String n1[] = s1.split("");
        String n2[] = s2.split("");
        Arrays.sort(n1);
        Arrays.sort(n2);
        
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        
        for(int j = 0;j < n1.length;j++){
            sb.append(n1[j]);
            sb1.append(n2[j]);
        }
        
        if(sb.toString().equals(sb1.toString())){
            return true;
        }
        return false;
    }
}