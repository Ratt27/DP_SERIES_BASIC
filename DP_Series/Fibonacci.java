//Nth Fibonacci--->
// using storing and  memorizing technique
import java.util.*;
public class Fibonacci
{
static int[] dp;
 public static int fibo( int n)
{
if(n<=1) return n;
if(dp[n]!=-1) return dp[n];
int ans = fibo(n-1)+fibo(n-2);
dp[n]=ans;
return ans;
}
public static int nthFibo(int n)
{
dp= new int[n+1];
for(int i=0;i<=n;i++)
dp[i]=-1;
return fibo(n);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int result = nthFibo(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }
        sc.close();
}
}