import java.util.Scanner;

import static java.lang.System.in;

public class ExCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("You Are in the Right place !");
        }else{
            System.out.println("You are in the Wrong place !");
        }

    }
}
