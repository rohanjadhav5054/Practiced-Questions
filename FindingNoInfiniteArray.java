import java.util.Arrays;

public class FindingNoInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(ans(arr,(10)));
    }
    static int ans(int nums[],int target){
        int start = 0;
        int end = 1;
        //we are starting from the smallest chunk we are checking that chunk is big enough to include the target ,

        //here we decide how much the chunk we can get
        while(target > nums[end]) {
            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }
        // then we apply the binary search and find the index
        return searchingNo(nums,target,start,end);
    }
    static int searchingNo(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
