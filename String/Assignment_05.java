/*Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
*/


import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=obj.nextLine();
    System.out.println(str.substring(1,(str.length()-1)));
    }
}
