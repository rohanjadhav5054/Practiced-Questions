
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int mid;
        int flag = 0;
        while(low <= high){
            mid = (high + low) / 2;
            if(arr[mid] == target){
                flag = 1;
                break;
            }else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(flag == 1){
                System.out.println("Search Successful !");
        }else{
                System.out.println("Search Unsuccessful !");
        }
    }
}
