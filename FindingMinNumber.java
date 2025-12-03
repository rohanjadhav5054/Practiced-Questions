public class FindingMinNumber {
    public static void main(String[] args) {
        int arr[] = {23,1,56,67,2,90,1,7,5,34,2};
        System.out.println("Minimum Number is :- "+minNumber(arr));
    }
    //finding minimum element
    static int minNumber(int arr[]){
        if(arr.length < 1)return -1;
        int no = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(no > arr[i]){
                no = arr[i];
            }
        }
        return no;
    }
}
