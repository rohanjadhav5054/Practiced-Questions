public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    static int splitArray(int arr[],int n){
        int start = 0;
        int end = 0;

        for(int i = 0;i < arr.length;i++){
            start = Math.max(arr[i],start);
            end += arr[i];
        }

        //binarySearch
        while(start < end){
            //try for the middle for the potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for(int num : arr){
                if(sum + num > mid){
                    //you cannot add in this sub array
                    //say you add in the new subarray
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > n){
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return end;
    }
}
