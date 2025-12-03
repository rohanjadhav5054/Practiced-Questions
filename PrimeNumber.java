import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int n = 0;
        do{
            System.out.print("Enter Any Number You Like :- ");
            n = sc.nextInt();
            if(isPrime(n)){
                System.out.println("Number "+n+" Is Prime");
            }else{
                System.out.println("Number "+n+" Is Not Prime");
            }
            System.out.print("If You Want to Continue Please Enter 'Y' Or 'y' : ");
            choice = sc.next().charAt(0);
        }while(choice == 'Y'| choice =='y');
        System.out.println("Program Completed Successfully ! ThankYou !!");
    }
//    static boolean isPrime(int number){
//        if(number <= 1){
//            return false;
//        }
//        int c = 2;
//        while(c * c <= number){
//            if(number % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c < n){
            if(n % c == 0){
                return true;
            }
            c++;
        }
        return false;
    }
}