import javax.xml.stream.events.StartDocument;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{6,7,7,7,7,7,8,9},7)));
    }
    //brute Approach
    static int[] findFirstAndLastBrute(int arr[],int target){
        int newNums[] = {-1,-1};
        for(int i = 0;i < arr.length;i++){
            if(target == arr[i]){
                newNums[0] = i;
                break;
            }
        }
        for(int j = arr.length - 1;j >= 0;j--){
            if(target == arr[j]){
                newNums[1] = j;
                break;
            }
        }
        return newNums;
    }

    /*
    * Using Binary Search Approach Solved the Problem
    * */
    static int[] searchRange(int[] nums,int target){
        int ans[] = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int nums[],int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = start - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                //potential Answer is Found
                ans = mid;
                if(findStartIndex == true){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
