import java.io.*;
class Acceptf
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.print("Enter Number: ");
  Float n = Float.parseFloat(br.readLine());
  System.out.println("You entered : "+n);
 }
}
