public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,0,9,10};

        System.out.println("Is This Array Is Sorted : "+ArraySortedOrNot(arr,0));
    }

    public static boolean ArraySortedOrNot(int[] arr,int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && ArraySortedOrNot(arr,index + 1);
    }


}
