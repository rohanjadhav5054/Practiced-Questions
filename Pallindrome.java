public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("abcdcba"));
    }
    public static boolean isPallindrome(String s){
        s = s.toLowerCase();
        int first = 0;
        int end = s.length() - 1;

        while(first < end){
            if(s.length() == 0 || s == null){
                return true;
            }
            if(s.charAt(first) == s.charAt(end)){
                first++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
