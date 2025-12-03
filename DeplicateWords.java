//# Write a function to find duplicate words in a string
public class DeplicateWords {
    public static void main(String args[]){
        String str = "Hello world my name is rohan dadasaheb jadhav  rohan dadasaheb jadhav ";
        int count = 0;
        str = str.toLowerCase();//converting into the lower case 

        String words[] = str.split(" ");//splitting string into the words 
        

        for(int i = 0;i < words.length;i++){
            count = 1;
            for(int j = i+ 1;j < words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }
            if(count> 1 && words[i] != "0"){
                System.out.println("Duplicate words : "+words[i]);
            }
        }
        
        //     if(count > 1 && words[i] != "0"){
        //         System.out.println("Duplicate word: " + words[i]);
        //     }
        // }
    }
}
