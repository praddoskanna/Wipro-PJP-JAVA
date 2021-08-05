/*Given two strings, a and b, print a new string which is made of the following combination-first 
character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string1");
    String strbig=obj.nextLine();
    System.out.println("Enter the string2");
    String strsmall=obj.nextLine();
    int n1=strbig.length();
    int n2=strsmall.length();
    int ns=n1<n2?n1:n2;
    int nb=n1>n2?n1:n2;
    if(n2>n1)
    {
    String temp= strbig;
    strbig=strsmall;
    strsmall=temp;
    }
    StringBuffer str=new StringBuffer();
    for(int i =0;i<ns;i++)
    {
        str.append(strsmall.charAt(i));
        str.append(strbig.charAt(i));
        
    }
    for(int i=0;i<(nb-ns);i++)
    str.append(strbig.charAt(ns+i));
    
    System.out.println("The new String is "+ str);
        
    }
}
