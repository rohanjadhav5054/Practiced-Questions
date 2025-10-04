import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        int[] arr = {3,1,5,7,2,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int flag = 0;
        int loc = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == target){
                flag = 1;
                loc = i;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Search Successful !"+loc);
        }else{
            System.out.println("Search Unsuccessful !");
        }
    }
}
