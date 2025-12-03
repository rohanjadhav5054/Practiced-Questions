public class Search {
<<<<<<< HEAD
    public static void main(String[] args) {
        String name  = "charactereristics";
        char target = 's';

        if(search(name,target)){
            System.out.println("Search Successful");
        }else{
            System.out.println("search unsuccessful !");
        }


        //Range Search
        int nums[] = {2,6,1,6,8,12,34,67,23,34};
        int low = 1;
        int high = 10;
        int target1 = 23;
        if(rangeSearch(nums,low,high,target1) == -1){
            System.out.println("Element Is not found");
        }else{
            System.out.println("Element "+target1+"founded search successful");
        }

        // searching through the 2D Array
        int newNums[][] = {
                {1,2,3},
                {7,8,9},
                {4,5,6}
        };
//        int no[][]  = search2DArray();
    }
    static boolean search(String name,char target){
        if(name.length() == 0)return false;
        for(int i = 0;i < name.length();i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    //Searching in the Range
    static int rangeSearch(int nums[] ,int low , int high , int target){
        if(nums.length < 1) return -1;
        for(int i = low ;i < high;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    //searching in the 2D array
    static int[][] search2DArray(int nums[][],int target){
        for(int row = 0;row < nums.length;row++){
            for(int column = 0;column < nums[row].length;column++){
                if(nums[row][column] == target){
                    return new int[][]{{row},{column}};
                }
            }
        }
        return new int[][]{{-1},{-1}};
=======
    public static void main(String args[]){
        String str = "abcab";
        String str1 = "ab";
        int n = str.length();
        
        for(int i = 0;i < n;i++){
            
        }
>>>>>>> 7ff3904e52a356349c6dfde3ebc610c027a9b8b9
    }
}
