import java.util.Scanner;

public class FloorOfTheArray {
    /*
    * Finding the Floor of an Array
    * floor of an array Means number which number is greatest <= target
    * */
    /*
     * Leetcode Question 744 - find the smallest letter greater than target
     * */
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,9,12,34};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target :- ");
        int target = sc.nextInt();

        int result = floor(arr,target);
        if( result == -1){
            System.out.println("Floor Of An Array Is Not Present");
        }else {
            System.out.println("Floor Of the Array Is :- "+(result + 1));

        }
    }
    static int floor(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
