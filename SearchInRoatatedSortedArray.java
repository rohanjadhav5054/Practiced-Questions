public class SearchInRoatatedSortedArray {
    /*
    * Leetcode 33
    *
    * 1) find the pivot element for finding pivot there are several cases
    * 2) use binary search search element in two half's
    *
    *  - */
    public static void main(String[] args) {
        int arr[] = { 7,8,9,10,1,2,3};
        int target = 3;

        int pivot = findingPivot(arr);
        int first = binarySearch(arr,target,0,pivot);
        if(first != -1){
            System.out.println("Element Founded At : "+first);
        }else{
            System.out.println("Element Founded At : "+binarySearch(arr,target,(pivot+1),(arr.length - 1)));
        }
    }
    static int findingPivot(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1] && mid < end){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }else if(nums[start] < nums[mid]){
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarySearch(int nums[],int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = start - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
