import java.util.Arrays;

public class FindingNoInfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 1,2 ,3,4,5,6,7,8,9,12,15,17,18,20,23,24,27,29,31,33,34,35,37};
        System.out.println(ans(arr,23));
    }
    static int ans(int nums[],int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]) {
            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }
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
