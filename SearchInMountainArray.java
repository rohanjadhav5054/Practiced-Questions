public class SearchInMountainArray {
    /*
    * searching in the mountain Array
    *leetcode 1095 Find the Peak element in the mountain array
    *
    * 1) find the peak element In MountainArray
    * 2) Apply the order agnostic search
    * */
    public static void main(String[] args) {
        int nums[] = {1,2,4,6,7,6,4,3,1};
        int peak = peakElementInMountainArray(nums);
        int first = orderAgnosticBinarySearch(nums,3,0,peak);
        if(first != -1){
            System.out.println("Element Found At the position : "+first);
        }else{
            System.out.println("Element Found At the Possition : "+orderAgnosticBinarySearch(nums,3,(peak+1),(nums.length - 1)));
        }

    }
    static int peakElementInMountainArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return end;
    }
    static int orderAgnosticBinarySearch(int arr[],int target,int start,int end){
        //checking the array is in ascending and ddescending order using first and last element in an array.
        boolean isAsc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
