//Climbing stair--> Optimsed
 import java.util.*;
public class  Stairs
{
static int[] dp;
 public static int minClimb( int[] cost)
{
 dp= new int[cost.length];
Arrays.fill(dp,-1);
return Math.min(minCost(cost,0),minCost(cost,1));
}
public static int minCost(int[] cost, int idx)
{
if(idx>=cost.length) return 0;
if(dp[idx]!=-1) return dp[idx];
return dp[idx]=cost[idx]+Math.min(minCost(cost,idx+1),minCost(cost, idx+2));
}
public static void main(String[] args)
{
int[] values = {5,15,20};
        
        System.out.println("Minimum value required: " + minClimb(values));
}
}