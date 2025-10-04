import java.util.Scanner;

public class FindSumOfDigit {
    public static void main(String args[]){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        int rem = 0;

        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }    
        System.out.println("Sum of all digits is : "+sum);    

        sc.close();
    }
}
