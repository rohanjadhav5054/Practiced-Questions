//problem Statement : leetcodproblem 
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {

    public static int getRandomNumber(int min,int max){
        return ThreadLocalRandom
                .current()
                .nextInt(min,max + 1);

    }
    public static void main(String args[]){
        int min = 1;
        int max = 10;

        System.out.println("Random Number between " + min + " and " + max + ": " + getRandomNumber(min, max));
    }
}