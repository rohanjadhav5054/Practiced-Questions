
public class Garbage {
    
    public static void main(String args[]) {
        String[] n1 = {"ab","c"};
        String[] n2 = {"a","bc"};

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();


        for(String i : n1){
            s1.append(i);
        }
        for(String j : n1){
            s2.append(j);
        }
        s1.toString();
        s2.toString();
        System.out.println(s1.toString().equals(s2.toString()));

    }
}