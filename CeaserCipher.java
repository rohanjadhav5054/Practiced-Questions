import java.util.Scanner;

public class CeaserCipher {

    static Scanner sc = new Scanner(System.in);// Declaring It Globally Because Whenever I create Method it Can Be Used Globally.
    static StringBuilder encrypted = new StringBuilder();
    static StringBuilder decrypted = new StringBuilder();

    public static void main(String[] args) {
        System.out.print("Enter The Text :- ");
        String text = sc.nextLine();

        System.out.print("Enter The Shift Value :- ");
        int shift = sc.nextInt();

        System.out.println("Encrypted Text :- "+encryptedCoder(text,shift));
        System.out.println("Decrypted Text :- "+decryptedCoder(shift));

        sc.close();
    }

    public static  String encryptedCoder(String text,int shift){

        encrypted.setLength(0);// It Is Important

        for(int i = 0;i < text.length();i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                encrypted.append((char) ((ch - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                encrypted.append((char) ((ch - 'a' + shift) % 26 + 'a'));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static String decryptedCoder(int shift){

        decrypted.setLength(0);

        for(int j = 0;j < encrypted.length();j++){
            char ch = encrypted.charAt(j);
            if (Character.isUpperCase(ch)){
                decrypted.append((char) ((ch - 'A' - shift + 26) % 26 +'A'));
            } else if (Character.isLowerCase(ch)) {
                decrypted.append((char) ((ch - 'a' - shift + 26) % 26 + 'a'));
            }else {
                decrypted.append(ch);
            }
        }
        return  decrypted.toString();
    }

}
