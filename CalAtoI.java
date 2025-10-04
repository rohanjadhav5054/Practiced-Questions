public class CalAtoI {
    public static void main(String[] args) {
        String s = " -123";
        int n = s.length();
        int i = 0;
        //in this we will be calculation is there any white space present or not if yes
        //then we simply move ahead 
        while(i < n && s.charAt(i) == ' '){
            ++i;
        }
        //in this step we will be using sign if the sign will be negative 
        //then we will set sign to be negative by default sign will be positive 
        int sign = 1;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            ++i;
        }

        //here we actually we will be calculationg int the result if at the leading index 0 will be present 
        //then we will be actually ignoring that zero 
        //in the result = result * 10 + s.charAt(i) - 0  here we acctually calculationg result using ascii 
        //values and we will be storing result using long datatype 
        //after we will be multiplying result by sign and checking if my result is greater than Integer.MAX_VALUE if yes we will be resulting Integer.MAX_VALUE 
        //then in next condition we will checking if my result less than. my  Integer.MIN_VALUE if yes then we will be returning Integer.MIN_VALUE
        
        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            result = result * 10 + s.charAt(i) - '0';
            if(result * sign > Integer.MAX_VALUE){
                System.out.println("Your result is maximum than integer limit.");
            }
            if(result * sign < Integer.MIN_VALUE){
                System.out.println("your result is less than minimum integer");
            }
            ++i;
        }
    }
}
;