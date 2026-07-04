import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 40;
        boolean primes[] = new boolean[n+1];
        primeNoUptoN(n,primes);

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        if(isPrime(no)){
            System.out.println(no+" Is Prime Number ");
        }else{
            System.out.println(no+" Is Not a Prime Number ");
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while( c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    public static void primeNoUptoN(int n,boolean primes[]){

        for(int i = 2;i * i < n;i++){
            if(!primes[i]){
                for(int j = i * i;j < n;j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i = 2;i < n;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }


    }
}
