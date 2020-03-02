import java.io.*;
class Fileread
{
 public static void main(String args[])throws IOException
 {
  FileInputStream fis = new FileInputStream("Aaris.txt");
  System.out.println("file contents");
  int ch;
  while((ch=fis.read())!=-1)
  System.out.println(ch);
  fis.close();
 }
}
