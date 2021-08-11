/*
Number_of_occurance_elements
To count the number of occurance of all elements in a array;
inp 123121345
op 
1-3
2-2
3-2
4-1
5-1
*/
import java.util.*;

public class reversearray
{
    public static void main(String [] args)
    {   
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int[]array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList();// to count the occurance
        HashSet<Integer>hr=new HashSet();// to make the input array without duplicate
        for(int i:array)
        {ar.add(i);
        hr.add(i);}
        ArrayList<Integer> ls=new ArrayList<Integer>(hr);//to display elements
        for(int i=0;i<ls.size();i++)
        {   
            System.out.println("The occurance of element "+ ls.get(i) +" is  "+ Collections.frequency(ar,ls.get(i)));
        }
    }
}

