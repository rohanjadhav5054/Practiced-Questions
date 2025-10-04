

public class firsh {
    public static void main(String args[]){
        int value[] = {25,24,15};
        int wt[] = {18,15,10};
        int wtSack = 50;
        int n = value.length;
        
        System.out.println("Available Items : ");
        for(int i = 0;i < n;i++){
            System.out.println("Item "+i+1+" : "+" Weight  : "+wt[i]+" Value : "+value[i]);
        }

        System.out.println("KnapSack Capacity : "+wtSack);

        
    }
    static int knapSack(int W,int weight[],int values[],int n){
        
        int sp[][] = new int[n+1][W+1];
        
        for(int i = 0;i <= n;i++){
            for(int w = 0;w < W;w++){
                
            }
        }
        
        return n;
    }
}