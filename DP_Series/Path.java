import java.util.*;

public class Path {
    static int[][] dp;

    public static int paths(int m, int n) {
        // Base cases
        if (m == 1 || n == 1) return 1; // If only one row or column is left, only 1 path exists
        if (m == 0 || n == 0) return 0;

        // Memoization check
        if (dp[m][n] != -1) return dp[m][n];

        // Recursive calls
        int rightways = paths(m, n - 1);
        int downways = paths(m - 1, n);

        return dp[m][n] = rightways + downways;
    }

    public static int numberofPath(int m, int n) {
        dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return paths(m, n);
    }

    public static void main(String args[]) {
        int rows = 3;
        int cols = 3;
        int result = numberofPath(rows, cols);
        System.out.println("Number of paths in a " + rows + "x" + cols + " grid: " + result);
    }
}