public class JavaString {
    /*
    String is a class in Java.

    When we create string literals:
    String name = "Rohan";
    String name1 = "Rohan";

    Both references point to the same object in the String Pool.


    The '==' operator compares references (memory address),
    so it returns true.
    */

    public static void main(String[] args) {
        String name = "Rohan";
        String name1 = "Rohan";

        System.out.println(name == name1);// == it Will check the memory Address
        /*
        * Here It Actally Compares The Value So the Value is the Same the Output is true
        * */


        /*
        When we create strings using 'new':
        new String("Rohan Jadhav");

        Each time a new object is created in Heap memory,
        even if the value is the same.

        So '==' returns false because references (Memoory Location) are different.
        */

        String king = new String("Rohan Jadhav");
        String king1 = new String("Rohan Jadhav");

        System.out.println(king1 == king);


        /*
        * When You want to check for values using equals method
        * == is comparator
        * equals is method
        * */

        System.out.println(king.equals(king1));
        System.out.println(name.equals(name1));

        String str1 = "Rohan";
        String str2 = "Ro" + "han";
        System.out.println(str1 == str2);
    }
}
