// //concat 2 string and change to lower case

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the first string");
    String str=obj.nextLine();
    StringBuffer sb= new StringBuffer(str);
    System.out.println("Enter the Next String");
    String str1=obj.nextLine();
    sb.append(str1);
    System.out.println("The Final String is "+sb);
    }
}
