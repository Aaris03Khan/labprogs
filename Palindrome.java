import java.io.*;
class Palindrome
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter a string :");
  String S1 = br.readLine();
  StringBuffer sb = new StringBuffer();
  sb.append(S1);
  sb.reverse();
  String S2 = sb.toString();
  if(S1.equals(S2))
  {
   System.out.println("It is Palindrome");
  }
  else
  System.out.println("Not a Palindrome");
  }
}
