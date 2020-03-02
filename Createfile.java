import java.io.*;
class Createfile
{
 public static void main(String args[])throws IOException
 {
  DataInputStream dis = new DataInputStream(System.in);
  FileOutputStream fos = new FileOutputStream("Aaris.txt");
  System.out.println("Enter text(@ at the end):");
  char ch;
  while((ch=(char)dis.read())!='@')
  fos.write(ch);
  fos.close();
 }
}
