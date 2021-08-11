
/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers
Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/
import java.util.*;

public class reversearray
{
    public static void main(String [] args)
    {   int count=1;
        int[][]array={{11,55,33},{47,54,55},{37,48,19}};
       
        System.out.println("The Given array");
        for(int i=0;i<array.length;i++)
        { 
            for(int j= 0;j<array.length;j++)
            System.out.print(array[i][j] + "   ");
            System.out.println();
        }
        int max=0;
        for(int i=0;i<array.length;i++)
        { for(int j=0;j<array.length;j++)
            if (array[i][j]>max)
            max=array[i][j];
        }
        System.out.println("Max of array is   " + max);
        
    }
        
}
