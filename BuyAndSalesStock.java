import java.util.*;
public class  BuyAndSales{
    public static int[] buyAndSaleStock(int arr[]){
           int maxProfit=0;
           int salesPrice=0;
           int buyPrice = Integer.MAX_VALUE;
          for(int i=0;i<arr.length;i++)
           {    
                if(buyPrice<arr[i])
                {
                    int profit=arr[i]-buyPrice;
                    maxProfit=Math.max(profit,maxProfit);
                    if(maxProfit==profit)
                    { 
                           salesPrice=arr[i];
                    }
                }else{
                    buyPrice=arr[i];
                    }
            }
            //It is return the reference
            return new int[] {buyPrice , salesPrice ,maxProfit};
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Enter the Stock market pradiction of this Week.");
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] outputArr=buyAndSaleStock(arr);
        if(outputArr[2]>1)
        {
        System.out.println("You can get the maximum profit by buy the Stock in Rs "+outputArr[0]);
        System.out.println("And Sale the stock in Rs " +outputArr[1]);
        System.out.println("Profit : "+outputArr[2]);
        }else{
            System.out.println("Sorry You Get the profit to buy the stock in this week.");
        }

    }
}