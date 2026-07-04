import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        que();

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
        Scanner sc = new Scanner(System.in);

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

}
