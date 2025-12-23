//Fibonacci using tabulation
import java.util.*;
public class Fibonacci2
{
 public static int solution(int n)
{
int[] dp= new int[n+1];
if(n>0) dp[1]=1;
for(int i=2; i<=n;i++)
{
dp[i]=dp[i-1]+dp[i-2];
}
return dp[n];
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = solution(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
        
        sc.close();
}
}