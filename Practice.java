import java.util.Scanner;

public class Practice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        if(evenOdd(7)){
//            System.out.println("Given No Is the Even No ");
//        }else{
//            System.out.println("Given No Is the Odd No ");
//        }



//        swapNo(10,20);

//        System.out.println("Largest No Is :- "+largestNo(20,30,10));

//        reverseInteger(564);

//        System.out.println("Count The Digits :- "+countDigits(1));

//        sumOfDigits(34523456);

        if(pallindeome(121)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }


    static void q2(){
        int a = 10;
        int b = a;
        b = 20;

        System.out.println(a); //10
        System.out.println(b); //20
    }

    static void q3(){
        int age;
//        System.out.println(age); // Variable is not Initialized .
    }

    static void q4(){
        byte num1 = 10;
        short num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static void q5(){
        System.out.print("Enter Your Name :- ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age :- ");
        int age = sc.nextInt();

        System.out.print("Enter Your CGPA :- ");
        float cgpa = sc.nextFloat();

        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("CGPA :- "+cgpa);
    }

    static void que(){
        byte a = 100;
        byte b = 27;
        byte c = (byte)(a + b);
        System.out.println(c);
    }

    static void swapNo(int num1 ,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Num1 is : "+num1+" Num2 is : "+num2);
    }

    static boolean evenOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    static int largestNo(int num1,int num2,int num3){
        if(num1 > num2){
            if(num1 > num3){
                return num1;
            }else{
                return num3;
            }
        }else {
            if(num2 > num3){
                return num2;
            }else{
                return num3;
            }
        }
    }

    static void reverseInteger(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }

    static int countDigits(int n){
        int count = 0;
        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }

    static void sumOfDigits(int n){
        int sum = 0;

        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            sum += temp;
        }

        System.out.println(sum);
    }

    static boolean pallindeome(int n){
        int initialNo = n;
        StringBuilder sb = new StringBuilder();

        while (n > 0){
            int temp = n % 10;
            n = n / 10;
            sb.append(temp);
        }
        return Integer.parseInt(sb.toString()) == initialNo;
    }
}
