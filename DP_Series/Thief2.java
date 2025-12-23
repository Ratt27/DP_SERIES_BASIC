// Sticklr thief using DP
// optimised time complexity
// T.C-->O(n)
import java.util.Arrays;

public class Thief2 {
    public static int maxloot(int arr[], int idx, int[] dp) {
        // Base case
        if (idx >= arr.length) return 0;
        
        // 1. Check if we have already calculated this house's max loot
        if (dp[idx] != -1) return dp[idx];
        
        // 2. Option: Steal (current + skip one)
        int steal = arr[idx] + maxloot(arr, idx + 2, dp);
        
        // 3. Option: Skip (move to next)
        // Fixed: Added the dp array to the recursive call
        int skip = maxloot(arr, idx + 1, dp);
        
        // 4. Store and return the result
        return dp[idx] = Math.max(steal, skip);
    }

    public static int findSum(int arr[]) {
        if (arr.length == 0) return 0;
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return maxloot(arr, 0, dp);
    }

    public static void main(String[] args) {
        int[] houses = {5, 5, 10, 100, 10, 5};
        
        System.out.println("Maximum loot possible: " + findSum(houses));
    }
}