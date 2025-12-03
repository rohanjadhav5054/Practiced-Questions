public class KnapSack {
    // Function to solve the 0/1 Knapsack problem
    static int knapSack(int W, int[] weights, int[] values, int n) {
        // Create a DP table to store results of subproblems
        int[][] dp = new int[n + 1][W + 1];
        
        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;  // Base case: no items or no capacity
                else if (weights[i-1] <= w)
                    // Include or exclude the current item
                    dp[i][w] = Math.max(
                        values[i-1] + dp[i-1][w-weights[i-1]],  // Include item
                        dp[i-1][w]  // Exclude item
                    );
                else
                    dp[i][w] = dp[i-1][w];  // Can't include current item
            }
        }
        
        // Find the selected items
        System.out.println("Selected items:");
        int i = n, w = W;
        while (i > 0 && w > 0) {
            if (dp[i][w] != dp[i-1][w]) {
                System.out.println("Item " + i + ": weight = " + weights[i-1] + 
                                 ", value = " + values[i-1]);
                w = w - weights[i-1];
                i--;
            } else {
                i--;
            }
        }
        
        // Return maximum value that can be put in knapsack of capacity W
        return dp[n][W];
    }
    
    public static void main(String[] args) {
        // Example values and weights
        int[] values = {50, 100, 150, 200, 250};    // Values of items
        int[] weights = {10, 15, 25, 30, 40};       // Weights of items
        int W = 70;                                 // Capacity of knapsack
        int n = values.length;                      // Number of items

        System.out.println("Available Items:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Item %d: Weight = %dkg, Value = $%d\n", 
                            i+1, weights[i], values[i]);
        }
        System.out.println("Knapsack capacity: " + W + "kg\n");
        
        int maxValue = knapSack(W, weights, values, n);
        System.out.println("\nMaximum value possible: $" + maxValue);
        
        // Print the DP table for understanding
        System.out.println("\nDP Table (rows: number of items considered, columns: weight capacity):");
        System.out.print("Weight→  ");
        for (int w = 0; w <= W; w++) {
            System.out.printf("%4d ", w);
        }
        System.out.println("\nItems↓");
        printDPTable(W, weights, values, n);
    }
    
    // Helper function to print the DP table
    static void printDPTable(int W, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][W + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weights[i-1] <= w)
                    dp[i][w] = Math.max(values[i-1] + dp[i-1][w-weights[i-1]], dp[i-1][w]);
                else
                    dp[i][w] = dp[i-1][w];
                
                System.out.printf("%4d ", dp[i][w]);
            }
            System.out.println();
        }
    }
}
