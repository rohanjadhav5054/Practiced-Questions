public class Consisting69{
    public static void main(String args[]){
        int num = 69;
        String num1 = Integer.toString(num);
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < num1.length();i++){
            if(i != num1.length() - 1){
                if(num1.charAt(i) == '6'){
                    sb.append(9);
                }else{
                    sb.append(num1.charAt(i));
                }
            }else{
                if(num1.charAt(i) == '6'){
                    sb.append('9');
                }else{
                    sb.append(num1.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}