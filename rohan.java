public class rohan{
    public static void main(String args[]){
        String str = "Textbook";
        String str1 = str.toLowerCase();
        String n1 = str.substring(0,str1.length()/2);
        String n2 = str.substring(str1.length()/2,str1.length());
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i < n1.length();i++){
            if(n1.charAt(i) == 'a' || n1.charAt(i) == 'e' || n1.charAt(i) == 'i'|| n1.charAt(i) == 'o' || n1.charAt(i) == 'u'){
                count1++;
            }
            if(n2.charAt(i) == 'a' || n2.charAt(i) == 'e' || n2.charAt(i) == 'i'|| n2.charAt(i) == 'o' || n2.charAt(i) == 'u'){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(str1);
        System.out.println(n1);
        System.out.println(n2);
        

    }
}