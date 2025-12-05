import java.util.Scanner;

public class SmallestNoGreaterThanTarget {
    /*
    * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    * leetcode 744 ->
    */
    public static void main(String[] args) {
        char letters[] = {'a','c','d','f','g','h'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Target :- ");
        char target = sc.next().charAt(0);
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
