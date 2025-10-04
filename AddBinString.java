public class AddBinString {
    public static void main(String args[]){
        // String str1 = "11";
        // String str2 = "1";

        // int a = Integer.parseInt(str1,2);
        // int b = Integer.parseInt(str2,2);
        // int result = a + b;

        // System.out.println(Integer.toBinaryString(result));

        String str1 = "11";
        String str2 = "1";

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry == 1){
            int bit1 = i >= 0 ? str1.charAt(i) - '0' : 0;
            int bit2 = j >= 0 ? str2.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            --i;
            --j;
        }

        String n = sb.reverse().toString();
        System.out.println(n);



    }
}
