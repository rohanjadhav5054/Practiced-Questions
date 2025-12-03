import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float number = sc.nextInt();
//        System.out.println("Number :- "+number);
        float number = 23.5678f;
        int number1 = (int)(number);
        System.out.println(number1);

//        int a = 234;
//        byte b = (byte)(a);
//        System.out.println(b);
//        byte c = (byte)255;
//        System.out.println(c);

        byte b = 42;
        char c = 'b';
        short s = 3000;
        int i = 500;
        float f = 5.76f;
        double d = 500000.3453d;
        double result = (f * b)+(i / c) - (d-s);
        System.out.println(result);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));

    }
}
