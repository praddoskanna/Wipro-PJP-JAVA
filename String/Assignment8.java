
/*
Write a Java program that accepts a string (with * in it). The program should return a new string 
in which the following characters are removed-*, the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string1");
    String str=obj.nextLine();
    int n=str.length();
    for(int i =0;i<n;i++)
    {
        if(str.charAt(i) == '.' || str.charAt(i) == '[' ||str.charAt(i) == '*' || str.charAt(i) == '+' )
        continue;
        else
        System.out.print(str.charAt(i));
    }
    }
}
