import java.util.Arrays;

public class PatternRecursion {
    public static void main(String[] args) {
//        printPattern(5);

//        halfTriangle(5,0);
//        anotherHalfTriangle(5,0);

        int[] arr = {4,3,2,1};

//        bubbleSortRecursion(arr, arr.length - 1,0 );
//        System.out.println(Arrays.toString(arr));

        selectionSortRecursive(arr,arr.length ,0,0);
        System.out.println(Arrays.toString(arr));

    }

    // this approach uses the recursion & but it not that ideal it is my trial & error approach .
    public static void printPattern(int n){
        if(n == -1){
            return;
        }
        for(int i  = 0 ;i <= n;i++){
            System.out.print(" * ");
        }
        System.out.println();
        printPattern(n - 1);
    }

    /*
    *    * * * *
    *    * * *
    *    * *
    *    *
    *
    * */
    public static void halfTriangle(int row,int column){
        //Base Condition
        if(row == 0){
            return;
        }

        if(column < row){
            System.out.print(" * ");
            halfTriangle(row , column + 1);
        }else{//it means you printed the row now go to the new line
            System.out.println();//Go to the new line
            halfTriangle(row - 1,0);
        }
    }

    /*
    *
    *   *
    *   * *
    *   * * *
    *   * * * *
    *
    * */
    public static void anotherHalfTriangle(int row,int column){
        //Base Condition
        if(row == 0){
            return;
        }

        if(column < row){
            anotherHalfTriangle(row, column + 1);
            System.out.print(" * ");
        }else{//it means you printed the row now go to the new line
            anotherHalfTriangle(row - 1,0);
            System.out.println();//Go to the new line
        }
    }

    /*
    * Here We Used The Same approach for the bubble sort
    * */
    public static void bubbleSortRecursion(int arr[],int row,int column){
        //Base Condition
        if(row == 0){
            return;
        }

        if(column < row){

            if(arr[column] > arr[column + 1]){
                //swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;
            }

            bubbleSortRecursion(arr,row,column + 1);
        }else{

            bubbleSortRecursion(arr,row-1,0);
        }
    }

    /*
    * selection sort we will solve using this same approach
    * */

    public static void selectionSortRecursive(int[] arr,int row,int column,int max){
        if(row == 0){
            return;
        }

        if(column < row){
            if(arr[column] > arr[max]){
                selectionSortRecursive(arr,row,column + 1,column);
            }else{
                selectionSortRecursive(arr,row,column + 1,max);
            }
        }else{
            //swap
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1]= temp;
            // Go to the new line
            selectionSortRecursive(arr,row - 1, 0,0);
        }
    }


}
