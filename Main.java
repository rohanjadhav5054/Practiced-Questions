import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("this");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        System.out.println(n);
}
}


//public - access modifier - so we can access that class from anywhere 
//main - is the starting point of the program 
//class - name group of properties and functions 
//class name and file name should be the same 
//static - in java main present in the class.
//in the class  when we want to access anything we need to create the object of the class  then we access
//main is the stating point program so how we can run it 
// so here comes the static using static we can access the main without creating the object 
//String args is parameter is used to receive the command line arguments passed to java program .
//. use is access input from terminal pass values when running the program 