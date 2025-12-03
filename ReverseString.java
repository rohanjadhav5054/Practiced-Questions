public class ReverseString {
    public static void main(String args[]) {
        String str = "Rohan-Jadhav";
        char[] charArray = str.toCharArray();  // Convert to char array
        int n = str.length();
        int front = 0;
        int back = n - 1;
        
        while(front < back) {  // Changed <= to <
            // Swap characters
            char temp = charArray[front];
            charArray[front] = charArray[back];
            charArray[back] = temp;
            
            // Move pointers
            front++;
            back--;
        }
        
        // Convert back to String and print
        String reversed = new String(charArray);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
