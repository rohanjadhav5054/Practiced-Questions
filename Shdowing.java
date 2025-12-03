public class Shdowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        value();
    }

    public static void value(){
        System.out.println(x);
    }
}

/*
* shadowing means if the local variable has the same name as instance variable so it will hide the outer variable inside the scope.
* */
