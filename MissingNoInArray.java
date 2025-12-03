//Problem Statement : Leetcode 
public class MissingNoInArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,7,8,9,10};
        int total = 10;

        int expectedSum = (total * ((total + 1)))/2;
        int actualSum = 0;

        for (int i : arr) {
            actualSum += i;
        }
        System.out.println("The Missing Number is : "+(expectedSum - actualSum));
    }
}