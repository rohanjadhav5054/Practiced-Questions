

public class IntegerToRoman {
    public static void main(String args[]){
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int no = 50;

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < values.length;i++){
            while( no >= values[i]){
                no -= values[i];
                sb.append(symbols[i]);
            }
        }

        
        System.out.println(sb);
    }
}
