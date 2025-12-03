public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(2,3));
        System.out.println(area(4.2f));
    }
    static int area(int length,int breadth){
        return length * breadth;
    }
    static float area(float radius){
        return 3.14f * (radius) * (radius);
    }
    static int area(int side){
        return side * side;
    }
}
