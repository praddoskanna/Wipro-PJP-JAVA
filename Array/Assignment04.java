//Initialize an integer array with ascii values and print the corresponding character values in a single row.
public class ascii
{
    public static void main(String[] args)
    {
        int[]ascii={64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
        for(int i:ascii)
        {
            System.out.print((char)i + "  ");
        }
    }
}
