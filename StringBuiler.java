
public class StringBuiler {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String name = "Rohan jadhav";

        for(Character i : name.toCharArray()){
            sb.append(i);
        }
        sb.append(" Hello i am from sangli.");
        System.out.println(name);
        System.out.println(sb);
    }
}
