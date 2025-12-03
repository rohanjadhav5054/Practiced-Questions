import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //we have to rotate the image by 90 degrees
//        try to create the new array and store results
        int ans[][] = new int[3][3];
        int n = arr.length;
        for(int row = 0;row < arr.length;row++){
            for(int column = 0;column < arr[row].length;column++){
                ans[column][n-1-row] = arr[row][column];
            }
        }
        for(int i[] : ans){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
