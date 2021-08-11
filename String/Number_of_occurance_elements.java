/*String duplicate removed
ip hello world
op 
' ' -1
h-1
e-1
l-3
o-1
w-1
r-1
d-1
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
        TreeSet<Character>hr=new TreeSet();// to make the input array without duplicate
        for(char i:ch)
        {ar.add(i);
        hr.add(i);}
        ArrayList<Character> ls=new ArrayList<Character>(hr);//to display elements
        for(int i=0;i<ls.size();i++)
        {   
            System.out.println("The occurance of element "+ ls.get(i) +" is  "+ Collections.frequency(ar,ls.get(i)));
        }
    }
}
