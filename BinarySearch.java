import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {20,12,11,3,2,1};
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Element You Want to FInd :- ");
        int target = sc.nextInt();
        int result = orderAgnosticBinarySearch(arr,target);

        if(result == -1){
            System.out.println("Element Is Not Found in the Array !.");
        }else{
            System.out.println("Element "+target+" is found in the position "+(result + 1)+" .");
        }
    }

    static int binarySearch(int arr[],int target){
        int start = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            //finding the middle the element
//            int mid = (start + end) / 2; //might be the possible that (start + end) exceeds the integer range
            int mid = start + (end - start) / 2;
            if(target < mid){
                end = mid - 1;
            }else if(target > mid){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
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
