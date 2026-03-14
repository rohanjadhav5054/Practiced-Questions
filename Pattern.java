public class Pattern {
//    static void square(int n){
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < n;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
    static void square(int n){
        for(int row = 0;row < n;row++){
            for(int column = 0;column < n;column++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void rightAngledTriangle(int n){

//        Right Angled Triangle
        for(int row = 0;row <= n;row++){
//            for every row run the column.
            for(int column = 0;column <= row;column++){
                System.out.print(" * ");
            }
//            After Finishing one row we need to add new line.
            System.out.println();
        }

        System.out.println();

//        Tilted Right Angled Triangle
        for(int row = 0;row <= n;row ++){
            for(int column = 0;column <= n - row ;column++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
//        Numbered Right Angled Triangle
        for(int row  = 0;row <= n;row ++){
            for(int col = 0;col <= n - row;col++){
                System.out.print(" "+col+" ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n){
//        Verticle Trianle

        for(int row = 0;row < n;row ++){
            for(int column = 0;column < row;column++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int row  = 0;row < n;row ++){
            for(int col = 0;col < n - row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        triangle(5);
//        rightAngledTriangle(5);
    }

}
