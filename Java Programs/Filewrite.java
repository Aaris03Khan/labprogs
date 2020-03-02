import java.io.*;
class Filewrite
{ 
 public static void main(String args[])throws IOException
 {
  String str ="this is a book on java"+"\n I am a begineer in java";
  FileWriter fw = new FileWriter("Aaris.txt");
   for(int i=0;i<str.length();i++)
   fw.write(str.charAt(i));
   fw.close();
 }
}
