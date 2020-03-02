import java.io.*;
class Acceptc
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  System.out.print("Enter Characters: ");
  char ch=(char)br.read();
  System.out.println("You entered : "+ch);
 }
}
