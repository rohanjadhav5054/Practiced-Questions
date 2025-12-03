//using iterative apporoach 
public class MInMaxUsingIterative {
    public static void main(String args[]){
        int arr[] = {16,23,45,67,1,7};
        
        int min = arr[0];
        int max = arr[0];

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
