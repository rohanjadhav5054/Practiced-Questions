public class SecondLargestElement {
    public static void main(String args[]){
        int arr[] = {1,1,2,3,4,5,6,6,7,8,8};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            }else if(n > second && n != first){
                second = n;
            }
        }

        System.out.println(first);
        System.out.println(second);
        
    }
}
