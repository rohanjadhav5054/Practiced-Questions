interface Calculator{
    void calculate(int value);
}

class Square implements Calculator{
    int result;
    public void calculate(int value){
        result = value * value;
        System.out.println("Square : "+result);
    }
}
class Cube extends SquarePattern{
    public void calculate(int value){
        super.calculate(value);
        result = value * value * value;
        System.out.println("Cube : "+result);
    }
}
public class CalculatorProblem {
    public static void main(String args[]){
        Calculator obj = new Cube();
        obj.calculate(3);
    }
}
