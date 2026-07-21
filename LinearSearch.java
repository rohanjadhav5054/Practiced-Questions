import java.util.Scanner;

 public class LinearSearch {

    public static void main(String args[]){
        int[] arr = {3,1,5,7,2,9};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the target : ");
//        int target = sc.nextInt();
//        int flag = 0;
//        int loc = 0;
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] == target){
//                flag = 1;
//                loc = i;
//                break;
//            }
//        }
//
//        if(flag == 1){
//            System.out.println("Search Successful !"+loc);
//        }else{
//            System.out.println("Search Unsuccessful !");
//        }

        System.out.println("Element Is Founded : "+linearSearchRecursion(arr,9,0));

        int search = linearSearchRecursionValue(arr,9,0);
        if(search == -1){
            System.out.println("Search Unsuccessful");
        }else{
            System.out.println("Element Is Found At position : "+search);
        }
    }

    // This Function only Tells Element Is Founded Or Not
    public static boolean linearSearchRecursion(int[] arr,int target , int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || linearSearchRecursion(arr,target,index+1);
    }

    //This Function Tells That target Found At Which position
    public static int linearSearchRecursionValue(int[] arr,int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index + 1;
        }
        return linearSearchRecursionValue(arr,target,index+1);
    }
}
