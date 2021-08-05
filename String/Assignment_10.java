/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 
Example1)
i/p:Wipro,3
o/p:propropro
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=obj.nextLine();
    System.out.println("Enter the number");
    int n=obj.nextInt();
    int len=str.length();
    for(int i=0;i<n;i++)
    System.out.print(str.substring(len-n,len));
    }  
}
