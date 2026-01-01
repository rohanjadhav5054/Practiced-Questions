import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTheErrors(new int[]{1,2,2,4})));
    }

    static int[] findTheErrors(int nums[]){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int nums[],int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
