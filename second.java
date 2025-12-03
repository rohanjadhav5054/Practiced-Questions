public class second {
    static void solveKnapsack(int capacity, int[] weights, int[] values, String[] itemNames) {
        int n = weights.length;
        
        System.out.println("Available Items:");
        System.out.println("---------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s: Weight = %dkg, Value = $%d\n", 
                            itemNames[i], weights[i], values[i]);
        }
        System.out.println("\nShopping bag capacity: " + capacity + "kg");
        
        int[][] dp = new int[n + 1][capacity + 1];
        
        System.out.println("\nMaking decisions for each item and weight...");
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i-1] <= w) {
                    // We can take this item if we want
                    int takeItem = values[i-1] + dp[i-1][w-weights[i-1]];
                    int skipItem = dp[i-1][w];
                    dp[i][w] = Math.max(takeItem, skipItem);
                } else {
                    // Item too heavy, must skip it
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        
        // Step 4: Find what items to take
        System.out.println("\nBest items to put in shopping bag:");
        System.out.println("--------------------------------");
        int w = capacity;
        int totalWeight = 0;
        int totalValue = 0;
        
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i-1][w]) {
                System.out.printf("Take %s: Weight = %dkg, Value = RS%d\n",
                                itemNames[i-1], weights[i-1], values[i-1]);
                totalWeight += weights[i-1];
                totalValue += values[i-1];
                w = w - weights[i-1];
            }
        }
        
        // Step 5: Show summary
        System.out.println("\nSummary:");
        System.out.println("--------");
        System.out.println("Total weight: " + totalWeight + "kg out of " + capacity + "kg");
        System.out.println("Total value: $" + totalValue);
    }

    public static void main(String[] args) {
        String[] items = {"Apple", "Orange", "Banana", "Mango"};
        int[] weights = {2, 3, 1, 4};  
        int[] values = {4, 5, 3, 7};
        int bagCapacity = 7;
        
        solveKnapsack(bagCapacity, weights, values, items);
    }
}
