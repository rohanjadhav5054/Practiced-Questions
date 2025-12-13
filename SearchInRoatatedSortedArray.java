public class SearchInRoatatedSortedArray {
    /*
    * Leetcode 33
    *
    * 1) find the pivot element for finding pivot there are several cases
    * i) there ia one condition only where two parts are ascending and decesnding  : mid > mid + 1
    * ii) if mid element is < mid - 1 this is also one condition
    * iii) start >= mid  hence we can ignore right side part search only in left side part end = mid - 1
    * iv) start < mid so we ignore left side and look in the right side start = mid + 1
    * 2) use binary search search element in two half's
    *
    *  - */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 1;

        int pivot = findingPivot(arr);
        System.out.println(pivot);
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
            //case 1 :- in this case when we calculate middle the middle + 1 element is smaller than middle .this is only one case so the pivot is the middle element
            if(mid < end && nums[mid] > nums[mid + 1]  ){
                return mid;
            }
            //case 2 :- it is just like case first but this is reverse of it it is also possible
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            //case 3 :- in this cases we compare start with the middle element and take decision we can fing pivot in which half
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
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //for finding pivot in the duplicate array
    static int findingPivotInDuplicates(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case 1 :- in this case when we calculate middle the middle + 1 element is smaller than middle .this is only one case so the pivot is the middle element
            if(mid < end && nums[mid] > nums[mid + 1]  ){
                return mid;
            }
            //case 2 :- it is just like case first but this is reverse of it it is also possible
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            //if the middle , end and start are equal & then skip the duplicates .
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //skip the duplicates
                //what if start And end  these are the pivot element

                //checking start is pivot
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;

                //checking end is pivot or not
                if(nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted so pivot should be in the right
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
