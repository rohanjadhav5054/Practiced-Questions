public class FindThePeakElementInMountainArray {
    /*
    * Leetcode 852 - find index of peak element in the mountain array
    * arr[1,2,3,4,5,3,2,1]*/
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,6,5,3,2,1};
        System.out.println(findPeak(arr)+ 1);

    }
    static int findPeak(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
                //you are in the decreasing part of the array
                //this may be the ans but look at the left side
                //this is why end != mid - 1
            }else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
                //you are in the increasing part of the array
                //we know this is not answer because front index id is grater that than this index that's why we excluding this
            }

        }
        // at the end start and end are in the same position so you can return any of the that would br the mountain element
        return end;
    }
}
