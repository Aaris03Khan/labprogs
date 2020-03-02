import java.io.*;
class Accepts
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.print("Enter String: ");
  String s = br.readLine();
  System.out.println("You entered : "+s);
 }
}
