import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int nums[][] = {
                {10 , 20, 30, 40},
                {15 , 25, 35, 45},
                {28 , 29, 37, 47},
                {33 , 34, 38, 50}
        };
        int target = 10;

        System.out.println(Arrays.toString(search(nums,target)));

        int target1 = 2;
        int nums1[][] = {
                {1 ,  2,  3,  4},
                {5 ,  6,  7,  8},
                {9 ,  10, 11, 12},
                {13 , 14, 15, 16}
        };
        System.out.println(Arrays.toString(searchIn2D(nums1,target1)));

    }
    /*
    *   This Matrix Is Sorted Row & Column Wise
    *           {10 , 20, 30, 40},
    *           {15 , 25, 35, 45},
    *           {28 , 29, 37, 47},
    *           {33 , 34, 38, 50}
    * */
    static int[] search(int matrix[][],int target){
        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0){
            //case 1 = eleement  == target
            if(matrix[row][column] == target){
                return new int[]{row , column};
            }
            if(matrix[row][column] < target){
                //case 2 : element < target
                row++;
            }else{
                //case 3: element > target
                column--;
            }
        }
        return new int[]{-1,-1};
    }

    /*
     *   This Matrix Is sorted
     *           {1 ,  2,  3,  4},
     *           {5 ,  6,   7, 8},
     *           {9 ,  10, 11, 12},
     *           {13 , 14, 15, 16}
     * */
    public static int[] searchIn2D(int matrix[][],int target){
        int rows = matrix.length;
        int columns = matrix[0].length;
        if (columns == 1) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == target) return new int[]{i,0};
            }
            return new int[]{-1,-1};
        }
        if(rows == 1){
            return binarysearch(matrix, 0, 0, columns - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        //runs the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)){//while this is true it will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }else if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the answer in the middle column of two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        //now searchin in those four parts
        //search in first half
        if(target <= matrix[rStart][cMid - 1]){
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][columns - 1]) {
            return binarysearch(matrix, rStart, cMid + 1, columns - 1, target);
        }
        //search in third half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarysearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //search in fourth half
        else{
            return binarysearch(matrix, rStart + 1, cMid + 1, columns - 1, target);
        }
    }
    //we need this function for searching in the indivisual rows
    //we need matrix as parameter , in which row do you wanna search ,also which column till column you are searching
    static int[] binarysearch(int matrix[][],int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }else if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
