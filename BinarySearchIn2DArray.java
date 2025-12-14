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
        System.out.println(Arrays.toString(searchSortedMatrix(nums1,target1)));

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
    static int[] searchSortedMatrix(int matrix[][],int target){
        int row = matrix.length;
        int column = matrix[0].length;

        if(row == 1){
            return binarySearch(matrix,0,0,column - 1,target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = column / 2;

        // run the loop till two rows will remaining
        while(rStart < (rEnd - 1)){//while this is true it will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }
        //Now There are two rows remaining
        //check whether target in the middle column
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1,cMid};
        }

        //search in first half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix,rStart,0,cMid - 1,target);
        }
        //search in second half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]){
            return binarySearch(matrix,rStart,cMid+1,column - 1,target);
        }
        //search in third half
        //search in fourth half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix,rStart+1,0,cMid - 1,target);
        }else{
            return binarySearch(matrix,rStart+1,cMid+1,column-1,target);
        }
    }

    //search in the row provided  and cols provided
    static int[] binarySearch(int[][] matrix , int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }

            if( matrix[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
