import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Operators {
    public static void main(String[] args) {

        /*
        * byte, short, char → automatically promoted to int during arithmetic Operation
        *
        * */
        System.out.println('a'+'b');
        System.out.println("a"+"b"); // string concatination
        System.out.println("a"+'b'); // whenever there is  at least one string + becomes conatination means If one operand is String → everything becomes String


        System.out.println('a'+ 3); //beacuse character is promoted to the int
        System.out.println((char) ('a'+3));//it will promote to int after char(100) == d
        System.out.println("a"+ 3); // this is same after a few steps "a"+"1"
        //integer will be converted into its wrapper class Integer then using using to string it converted into the string

        System.out.println("Hello"+new int[]{});
        System.out.println("Nihao"+new ArrayList<>());
        System.out.println("Bonjour"+new TreeSet<Integer>(Arrays.asList(1,2,3)));

        System.out.println("ThankYou Guys Are For Real !");
    }
}
