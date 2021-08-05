/ /*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 where 'n' is the length of the string.
Example1
i/p:Wipro
o/p:WiWiWiWiWi
*/
  
  import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=obj.nextLine();
    int n=str.length();
    StringBuffer sb= new StringBuffer(str);
    sb.delete(2,n);
    System.out.println("The New String:  ");;
    for(int i=1;i<=n;i++)
    System.out.print(sb);
    }
}
