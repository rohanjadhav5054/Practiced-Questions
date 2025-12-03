import java.util.Scanner;
public class CalculateElectricityBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Electricity Consumed in units : ");
        int units = sc.nextInt();
        int bill = 0;
        if(units > 100){
            if(units > 200){
                if(units > 300){
                    if(units > 400){
                        bill = units * 7;
                    }
                }
                else{
                    bill = units * 6;
                }
            }
            else{
                bill = units * 5;
            }
        }else{
            bill = units * 4;
        }

        System.out.println("Bill Of Electricity is : "+bill);
    }
}
