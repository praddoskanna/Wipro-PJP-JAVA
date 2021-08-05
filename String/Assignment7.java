/*Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate
*/

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string1");
    String str=obj.nextLine();
    int n=str.length();
    if(((str.charAt(0)) == 'x') && (str.charAt(n-1))=='x')
    System.out.println(str.substring(1,(n-1)));
    else
    System.out.println(str);
    }
}
