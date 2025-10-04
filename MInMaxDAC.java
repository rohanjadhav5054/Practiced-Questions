public class MInMaxDAC {
    public static void main(String args[]){
        int[] nums = {10,34,45,2,67,89};
        int[] result = MinMax(nums, 0, nums.length - 1);
        System.out.println("Min is "+result[0]);
        System.out.println("Max is "+result[1]);
    }

    public static int[] MinMax(int arr[],int min,int max){
        if(min == max){//one element
            return new int[]{arr[min],arr[min]};
        }
        if(max == min+1){//two element
            if(arr[min] < arr[max]){
                return new int[]{arr[min],arr[max]};
            }
            else{
                return new int[]{arr[max],arr[min]};
            }
        }
        int mid = (min + max)/2;
        int leftResult[] = MinMax(arr,min,mid);
        int rightResult[] = MinMax(arr, mid + 1, max); 

        int newMin = Math.min(leftResult[0], rightResult[0]);
        int newMax = Math.max(leftResult[1], rightResult[1]);
        return new int[]{newMin,newMax};
    }
}
