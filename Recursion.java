public class Recursion {
    public static void main(String[] args) {
        printHello(1);
        int result = fibonacciNumbers(5);
        System.out.println(result);
    }

    public static void printHello(int n){
        if (n == 5) {
            System.out.println();
            return;
        }
        System.out.println("Hello World Brother No "+ n);
        printHello(n+1);
    }
    public static int fibonacciNumbers(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return fibonacciNumbers(n - 1 ) + fibonacciNumbers(n-2 );
        }
    }
}

