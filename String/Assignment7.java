
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string1");
    String str=obj.nextLine();
    if(str.charAt(0).equals("x") && str.charAt(str.length()).equals("x"))
    System.out.println(str.substring(1,(str.length-1)));
    else
    System.out.println(str);
    }
}
