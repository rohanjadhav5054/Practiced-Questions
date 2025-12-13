import java.util.Scanner;

public class CeilingOfArray {
    public static void main(String[] args) {
        int arr[] = { 1,3,4,5,7,8,12,15,17,20,22,34};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Target Element :- ");
        int target = sc.nextInt();

        int result = ceilingOfArray(arr,target);

        if(result <= arr.length - 1){
            System.out.println("Ceiling Of An Array : "+(result + 1));
        }else{
            System.out.println("Ceiling of the Array Does not exist");
        }
    }
    static int ceilingOfArray(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }


}
