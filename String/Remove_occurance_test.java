/*
i/p helloworld
o/P hewrd :32
*/
import java.util.*;

public class reversearray
{
    public static void main(String [] args)
    {   
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        List<Character> ar=new ArrayList();// to count the occurance
        LinkedHashSet<Character>hr=new LinkedHashSet();// to make the input array without duplicate
        for(char i:ch)
        {
            if(i==' ')continue;
            ar.add(i);
            hr.add(i);
        }
        System.out.println("New string");
        LinkedList<Character> ls=new LinkedList<Character>(hr);//to display elements
        for(int i=0;i<ls.size();i++)
        {   if(Collections.frequency(ar,ls.get(i)) ==1)
            System.out.print(ls.get(i));
        }
        System.out.print(" : ");
        for(int i=0;i<ls.size();i++)
        {   if(Collections.frequency(ar,ls.get(i)) >1)
            System.out.print(Collections.frequency(ar,ls.get(i)) );
        }
    }
}
