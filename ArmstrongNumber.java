import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int choice = 0;
        do{
            System.out.print("Enter any Number : ");
            n = sc.nextInt();
            if(isArmstrongNumber(n)){
                System.out.println("This Number "+n+" is the Armstrong Number ");
            }else{
                System.out.println("This Number "+n+" is Not the Armstrong Number ");
            }
            System.out.print("If You Want to Continue Please Enter 'Y' Or 'y' : ");
            choice = sc.next().charAt(0);
        }while(choice == 'Y' | choice =='y');
        System.out.println("Program is Exitted ! ThankYou !");
    }
    static boolean isArmstrongNumber(int number){
        int actualNumber = number;
        ArrayList<Integer> ar = new ArrayList<>();
        while(number > 0){
            int temp = number % 10;
            ar.add(temp);
            number = number / 10;
        }
        int sum = 0;
        for(int n : ar){
            sum += ((n)*(n)*(n));
        }
        System.out.println(sum);
        if(sum == actualNumber){
            return true;
        }
        return false;
    }
}
