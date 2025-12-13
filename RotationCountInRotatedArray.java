public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {2,9,2,2,2};

        int pivot = findPivotInDuplicates(arr);
        System.out.println("Pivot Element Is : "+pivot);
        System.out.println("Array is rotated in : "+(pivot+1)+" Times");
    }

    //finding the pivot in the unique array
    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    //finding the pivot in the duplicate array
    static int findPivotInDuplicates(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(arr[start] > arr[start+ 1]){
                    return start;
                }
                start++;
                
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }
}
