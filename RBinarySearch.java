public class RBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};

        System.out.println(search(arr,8,0,7));
    }

    public static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        //Calculating The Mid
        int mid = start + (end - start) / 2;

        //If element Found At The middle Position then we return the position
        if(arr[mid] == target){
            return mid;
        }

        //checks if left half is sorted or not
        if(arr[start] <= arr[mid]){
            // is target inside the left sorted half
            if(arr[start] <= target && arr[mid] >= target){
                return search(arr,target,start,mid - 1);
            }else{
                //otherwise search right
                return search(arr,target,mid + 1,end);
            }
        }

        //is right half is sorted
        //is target lie in the right sorted half
        if(target >= arr[mid] && target <= arr[end]){
            return search(arr,target,mid+1,end);
        }
        //otherwise search left
        return search(arr,target,start,mid - 1);
    }
}
