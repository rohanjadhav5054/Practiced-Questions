public class FindDuplicate {

    /*
    *Leetcode 287 Find The Duplicate Numbers
    *   */
    public static void main(String[] args) {
        int nums[] = {2,3,5,2,1};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int nums[],int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    public static void findMultipleDuplicates(int nums[]){
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int correct =
            }
        }
    }
}
