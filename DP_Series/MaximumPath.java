import java.util.*;

public class MaximumPath {
    public static int Solution(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];

        // 1. Initialize the 1st row (Base Case)
        for (int j = 0; j < n; j++) {
            dp[0][j] = arr[0][j];
        }

        // 2. Fill the DP table starting from the 2nd row (i = 1)
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate values from the previous row
                int leftDiag = (j - 1 >= 0) ? dp[i - 1][j - 1] : Integer.MIN_VALUE;
                int up = dp[i - 1][j];
                int rightDiag = (j + 1 < n) ? dp[i - 1][j + 1] : Integer.MIN_VALUE;

                // The path sum for current cell is its value + max of the 3 options above
                dp[i][j] = arr[i][j] + Math.max(leftDiag, Math.max(up, rightDiag));
            }
        }

        // 3. The answer is the maximum value in the last row
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            max = Math.max(max, dp[m - 1][j]);
        }
        return max;
    }

    public static void main(String args[]) {
        // Example Grid
        int[][] grid = {
            {1, 2, 10, 4},
            {100, 3, 2, 1},
            {1, 1, 20, 2},
            {1, 2, 2, 1}
        };

        int result = Solution(grid);
        System.out.println("The Maximum Path Sum is: " + result);
    }
}