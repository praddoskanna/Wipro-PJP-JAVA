  
/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers
Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
*/
import java.util.*;

public class reversearray
{
    public static void main(String [] args)
    {   int count=1;
        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
       
        System.out.println("The Given array");
        for(int i=0;i<array.length;i++)
        { 
            for(int j= 0;j<array.length;j++)
            System.out.print(array[i][j] + "   ");
            System.out.println();
        }
        System.out.println("The Reversed array");
        for(int i=(array.length-1);i>=0;i--)
        { 
            for(int j=(array.length-1);j>=0;j--)
            System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }
        
}
