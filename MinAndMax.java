
import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,8,10};
        Arrays.sort(arr);

        System.out.println("Min : "+arr[0]);
        System.out.println("Max : "+arr[arr.length - 1]);
    }
}
