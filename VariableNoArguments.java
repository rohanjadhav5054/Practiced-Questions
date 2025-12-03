import java.util.Arrays;

public class VariableNoArguments {
    public static void main(String[] args) {
        value("Rohan","Dadasaheb","Jadhav","Sadiya","Numan","kaivalya","Jishan","Darshan");

        System.out.println("Sum of these Numbers :- "+add(1,2,3,4,5,6,7,8,9,10));
    }

    public static void value(String ...v){
        System.out.println(Arrays.toString(v));//printing all one take

        for(String n : v){//printing one by one
            System.out.println(n);
        }
    }
    public static int add (int  ...v){
        int sum = 0;
        for(int number : v){
            sum += number;
        };
        return sum;
    }
}
//in variable length of arguments in java it allows you to pass any no of arguments in method without creating arrays manually
