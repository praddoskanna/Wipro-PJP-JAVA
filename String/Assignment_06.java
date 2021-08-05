/*Given 2 strings, a and b, return a new string of the form short+long+short,with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string1");
    String str1=obj.nextLine();
    System.out.println("Enter the string2");
    String str2=obj.nextLine();
    int n1=str1.length();
    int n2=str2.length();
    if(n1>n2)
    System.out.println(str2+str1+str2);
    else
    System.out.println(str1+str2+str1);
    }
}
