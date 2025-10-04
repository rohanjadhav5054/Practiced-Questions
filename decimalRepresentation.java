import java.util.ArrayList;

public class decimalRepresentation{
    public static void main(String args[]){
        ArrayList<Integer> ar = new ArrayList<>();
        int n = 527;
        while(n > 0){
            ar.add(n % 10);
            n = n / 10;
        }
        
        
        int divisor = 1;
        int nums[] = new int[ar.size()];
        int j = 0;
        for(int i = 0;i < ar.size();i++){
            nums[j++] = ar.get(i) * divisor;
            divisor *= 10;
        }

        System.out.println(ar);
        
        for(int i : nums){
            System.out.println(i);
        }

        reverseArray(nums);

        for(int i : nums){
            System.out.println(i);
        }
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}