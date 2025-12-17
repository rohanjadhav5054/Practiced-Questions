import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {7,6,5,4,3,2,1};
        bubbleSort(nums);
    }
    static void bubbleSort(int nums[]){
        boolean isSwapped;
        // run the loop in to the n - 1 times
        for(int i = 0;i < nums.length;i++){
            isSwapped = false;
            //for each step maximum element go to the last respective index
            for(int j = 1;j < nums.length - i;j++){
                //swap the item is smaller than the previous item
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
