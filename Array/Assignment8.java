/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

import java.util.*;
public class Duplicate
{
    public static void main (String[] args)
    {   
        int[]array={10,3,6,1,2,9};
        int sixpos=-1,sevenpos=-1,sum=0;
        for(int i=0;i<array.length;i++)
        {
        if(array[i]==6)sixpos=i;
        if(array[i]==7)sevenpos=i;
        }
        for(int i=0;i<array.length;i++)
        {
            if(sixpos!=-1 && i >= sixpos && i<=sevenpos)
            {continue;}
            sum+=array[i];
            
        }
        System.out.println("Sum  "+sum);
    }
}
