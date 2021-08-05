/*Write a java program that will return the first half of the string, if the length of the string is even.
 It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=obj.nextLine();
    int n=str.length();
    if(n%2 == 0)
        System.out.println(str.substring(0,(n/2)));
    else
        System.out.println("Null");;
    }
}
