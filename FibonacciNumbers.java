import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int number = fibonacci(n);
        System.out.println(number);
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
}
