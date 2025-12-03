class Solution {
    int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        // Initialize all to first element
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];
        
        // Start from second element
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            
            // Store temp max because maxSoFar will be modified
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;
            
            // Update result if we found bigger value
            result = Math.max(result, maxSoFar);
        }
        
        return result;
    }
}