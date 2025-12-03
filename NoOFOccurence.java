import java.util.Scanner;

public class NoOFOccurence {
    public static void main(String[] args) {
        //Method 1
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = 0;
        while(number > 0){
            temp = number % 10;
            if(temp  == 7){
                count++;
            }
            number  = number / 10;
        }
        System.out.println(count);

        //method 2
        String no ="557";
        count = 0;
        for(int i = 0;i < no.length();i++){
            if(Integer.parseInt(String.valueOf(no.charAt(i))) == 7 ){
                count ++;
            }
        }
        System.out.println(count);
    }
}
