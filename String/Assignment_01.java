// Palindrome 

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string for palindrome check");
    String str=obj.nextLine();
    StringBuffer sb =new StringBuffer(str);
    StringBuffer sb1 =new StringBuffer(str);
    System.out.println("String in BUFFER :" + sb);
    sb.reverse();
    if(sb.equals(sb1))
    System.out.println("The Given String is a Palindrome");
    else 
    System.out.println("The Given String is not a Palindrome");
    }
}
