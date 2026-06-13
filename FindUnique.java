public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2,6,4,1,3,2,5};
        System.out.println("Unique Number Is :- "+ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }


}
