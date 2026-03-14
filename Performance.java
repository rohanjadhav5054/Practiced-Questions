public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0;i < 26;i++){
            char ch = (char)('a'+ i);
            System.out.println("Character is ch "+ch);
            series += ch;
        }
        System.out.println("All The Values :- "+series);

        /*
        * Above Is Not The Good Practice
        * Explaination
        * In Java String Immutable(once created means Cannot be cchanged )
        * its internal array marked as final
        * so when you modify the String Java does not actually modify the old object It creates a brand new one
        * means for n time modification it will crete the n times objects .*/


        /*
        Best Practice ;- Use the StringBuilder
        */

        StringBuilder sb = new StringBuilder();
        for(int j = 0;j < 26;j++){
            char ch = (char)('a'+ j);
            sb.append(ch);
        }
        System.out.println("Using The StringBuilder : "+sb.toString());
    }
}
