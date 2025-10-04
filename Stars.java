

public class Stars {
    public static void main(String args[]){
        // N stars in the same line 
        int h = 10;
        // for(int i = 0;i < h;i++){
        //     System.out.print(" * ");
        // }

        //print n stars in square pattern 
        // for(int i = 0;i < h;i++){
        //     for(int j = 0;j < h;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //print increasing number of starts
        // int count = 0;
        // for(int i = 0;i < h;i++){
        //     count++;
        //     for(int j = 0;j < count;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //print a right aligned triangle of stars
        // for(int i = 0;i < h;i++){
        //     //for spaces
        //     for(int j = 0;j < h - i;j++){
        //         System.out.print("   ");
        //     }
        //     //for stars
        //     for(int k = 0;k <= i;k++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //print stars in the even order
        for(int i = 0;i < h;i++){
            for(int j = 0;j < 2 * i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //print stars in the odd order
        for(int i = 0;i < h;i++){
            for(int j = 0;j < 2 * i + 1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        for(int i = 0;i < h;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
