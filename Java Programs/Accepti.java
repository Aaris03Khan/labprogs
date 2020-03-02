import java.io.*;
class Accepti
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.print("Enter Number: ");
  int n = Integer.parseInt(br.readLine());
  System.out.println("You entered : "+n);
 }
}
