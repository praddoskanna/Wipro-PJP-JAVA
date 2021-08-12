// Palindrome 

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string for palindrome check");
    String str=obj.nextLine();
    str.toLowerCase()
    StringBuffer sb =new StringBuffer(str.toLowerCase());
    System.out.println("String in BUFFER :" + sb);
    String rev=sb.reverse().toString();
    if(str.equals(rev))
    System.out.println("The Given String is a Palindrome");
    else 
    System.out.println("The Given String is not a Palindrome");
    }
}
