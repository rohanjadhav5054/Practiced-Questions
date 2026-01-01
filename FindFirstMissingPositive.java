public class FindFirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,1,-1,4}));
    }
    static int firstMissingPositive(int nums[]){
        /*
        * First We Will sort the Array
        * Using condition to avoid big numbers
        * And Also number is greater then 0*/
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] > 0  && nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        /*
        * Now we Are Here Finding the is numbers is present in that position  using nums[j] == j+1
        * And Also if not present we return first positive index
        * At last if no is not found we retrun array length + 1x
        *  */
        for(int j = 0;j < nums.length;j++){
            if(nums[j] == j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }
    static void swap(int nums[],int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
