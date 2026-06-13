public class Recursion {
    public static void main(String[] args) {
//        printHello(1);
//        int result = fibonacciNumbers(4);
//        System.out.println(result);

        System.out.println(binarySearch(new int[]{1,2,3,4,5,6},5,0,5));
    }

    public static void printHello(int n){
        if (n == 5) {
            System.out.println();
            return;
        }
        System.out.println("Hello World Brother No "+ n);
        printHello(n+1);
        //this is the tale recursion
    }
    public static int fibonacciNumbers(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return fibonacciNumbers(n - 1 ) + fibonacciNumbers(n-2 );
        }
    }

    public static int binarySearch(int arr[],int target,int start,int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return mid;
        }

        if(arr[mid] < target){
            return binarySearch(arr,target,mid + 1,end);
        }

        return binarySearch(arr,target,start,mid - 1);
    }
}

