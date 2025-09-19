//This algorithm is very important is is used to find the max sum or product from all subarray.
// It helps to create good logic
import java.util.*;
public class kadaneAlgorithm{
    public static int maxSum(int arr[])
    { //Current sum
        int cs=0;
      //Max Sum  
        int ms=0;
       for(int i=0;i<arr.length;i++)
       {
           cs=cs+arr[i];
           if(cs<0)
           {
             cs=0;
           }
           ms=Math.max(cs,ms);
       } 
       return ms;
    }

    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the  Size of Array ");
          int s=sc.nextInt();
          System.out.println("Enter the Elements in Array");
          int arr[]=new int[s];
          for(int i=0;i<s;i++)
          {  arr[i]=sc.nextInt();                
          }
          int max=maxSum(arr);
          System.out.println("The Max value is :" +max);       
    }
} 