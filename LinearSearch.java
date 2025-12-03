import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Inputting the size of the Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of The Array You Want :- ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        //Inputing the Elements in ar Array
        System.out.println("Enter the Elements in that Array :- \n");
        for(int i = 0;i < nums.length;i++){
            System.out.print("Enter the Element "+(i+1)+" :- ");
            nums[i] = sc.nextInt();
        }

        //Entering the Target Element
        System.out.print("Enter the Target Element :- ");
        int target = sc.nextInt();

        //passing the target Element into the linearsearch Function
        int result = linearSearch(nums,target);
        if(result == -1){
            System.out.println("Element Not Found in the array ! Sorry");
        }else{
            System.out.println("Element "+target+" Found at position "+(result+1));
        }
    }
    static int linearSearch(int nums[],int target){
        if(nums.length < 1 ){
            return -1;
        }
        for(int i = 0;i < nums.length;i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}