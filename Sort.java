import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int nums[] = {3,4,2,1,5};
//        bubbleSort(nums);
//        selectionSort(nums);
//        insersionSort(nums);
        cyclicSort(nums);
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

    static void selectionSort(int nums[]){
        /*
        * In Selection sort on every step we find the maximum element and put it into the end position.
        * At every pass problem is reduce from right hand side*/

        for(int i = 0;i < nums.length;i++){
            /*
            * 1) Finding the last element .after each step array should be sorted from right hand side so that's
            * why lst element index would shift towards left hand side
            * 2)after finding the largest index. after each pass array would sorted from right hand side largest eement not be the
            * same so the we need to spsecify start and last index for searching the largest element index
            * 3)after finding the largest and last index we are swapping those indexes
            * */
            int last = nums.length - i - 1;
            int maxIndex = findMaxElement(nums,0,last);
            swap(nums,maxIndex,last);
        }
        System.out.println(Arrays.toString(nums));
    }

     static int findMaxElement(int[] nums,int start,int end) {

        /*
        * Here we Are finding the maximum element index and returning those index for swapping  in selection sort
        * */
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0;i <= end;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int arr[],int first,int second){
        /*
        * After finding the largest number we are swapping those number with the last element
        * */
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    /*
    * Insertion sort
    * */

    public static void insersionSort(int arr[]){
        //outer loop will run into n - 2 only
        for(int i = 0;i < arr.length - 1;i++){
            //inner loop can run backside and try to check some condions
            for(int j = i + 1;j > 0;j--){
                //in first condition it will check is the arr[j] element is less then arr[j-1] if yes it will swap that element using swap function
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                }else{
                    //otherwise it will just break the loop
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    * Cyclic Sort In Java
    * */
    static void cyclicSort(int arr[]){
        int i = 0;
        //whenever numbers are in the form of 1 to N then we use cyclic sort
        //loop will run throun i < arr.length
        while(i < arr.length){
            //first we find the correct index
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
