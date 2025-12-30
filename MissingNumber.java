
//Problem Statement : Leetcode
public class MissingNumber {
    public static void main(String args[]){
        int nums[] = {5,4,3,2,1,0};
        System.out.println(missingNumber(nums));
    }
    public static void missingNumberOptimal(int[] nums){
        int total = nums.length;
        /*
         * Here the formula used is (n*(n+1)) / 2 it will calculate sem of n numbers
         * This is the Majorly the Optimal Approach
         * */
        int expectedSum = (total * ((total + 1)))/2;
        int actualSum = 0;

        for (int i : nums) {
            actualSum += i;
        }
        System.out.println("The Missing Number is : "+(expectedSum - actualSum));
    }
    public static int missingNumber(int nums[]){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
                System.out.println("swap method called");
            }{
                i++;
            }
            System.out.println("in while loop");
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int arr[],int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}