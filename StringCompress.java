import java.util.*;

public class StringCompress{
    public static void code(StringBuilder str)
    {   
        StringBuilder newStr=new StringBuilder("");
         
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {  
                count++;
                i++;
            }
             newStr.append(str.charAt(i));
            if(count>1)
            {    
                newStr.append(count.toString());
            }
        }
        System.out.println(newStr);//Output a4b3c3
    }
    
    public static void main(String args[])
    {
         String str;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string for Compress");
         //You Enter aaaabbbccc
         //Check Comment output
         str=sc.nextLine();
         StringBuilder newStr=new StringBuilder(str);
         code(newStr);
    }
}