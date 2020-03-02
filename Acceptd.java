import java.io.*;
class Acceptd
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.print("Enter Number: ");
  double n = Double.parseDouble(br.readLine());
  System.out.println("You entered : "+n);
 }
}
