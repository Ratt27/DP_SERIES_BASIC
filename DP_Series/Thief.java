//Stickler thief-->
// normal method with high time complexity-->
import java.util.*;
public  class Thief
{
public static int maxloot(int arr[], int idx)
{
// we have now 2 options i- steal, ii- skip
if(idx>=arr.length) return 0;
int steal = arr[idx]+maxloot(arr,idx+2);
int skip=maxloot(arr,idx+1);
return Math.max(steal, skip);
}
public static void main(String[] args)
{
int[] values={2,5,8,4,9,3};
int result= maxloot(values,0);
System.out.println("maximum loot possible  "+result);
}
}