//Swap string variable without using temporary variable 
public class SwapStringVariable {
    public static void main(String args[]){
        String a = "Sadiya";
        String b = "Mujawar";

        System.out.println("Before Swap: a : " + a + ", b = " + b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println("After Swap: a : " + a + ", b = " + b);
    }
}
