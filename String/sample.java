/*Given two string inputs.
Consider the length of two strings and concat them
Rule to concat : Highest length should be first followed by lowest length
Post concat separate the characters at even indeces into an character array
and calculate the average of array elements by considering the ascii values

Example:
String input1 : "Del"
String input2 : "India"

Concat them : "IndiaDel"

char array[] = {'I','d','a','e'};

Output: 92 ((73+100+97+101)/4 = 371/4 = 92)*/
public class MyClass {
    public static void main(String args[]) {
      String str1="Del";
      String str2="India";
      int count=0,sum=0;
      String str=str1.length()>str2.length()?(str1+str2):(str2+str1);
      for(int i=0;i<str.length();i++)
      {
          if(i%2==0){
          sum+=(int)str.charAt(i);
          count++;}
      }
      sum=sum/count;
      
      System.out.println("average= " + sum);
    }
}
