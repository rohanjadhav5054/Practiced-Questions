import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //using advance for loop
        for(int i[] : arr){
            for(int j : i) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

//        inputting the multidimensional Arrays
        Scanner sc = new Scanner(System.in);
        int mdArray[][] = new int[3][3];
//      for inputting the array values
        for(int row = 0;row < mdArray.length;row++){
            for(int column = 0; column < mdArray[row].length;column++){
                mdArray[row][column] = sc.nextInt();
            }
        }
//      for printing the array values
        for(int i[] : mdArray){
            for(int j : i) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
        for(int i[]:mdArray){
            System.out.println(Arrays.toString(i));
        }
    }
}
