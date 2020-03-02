import java.io.*;
class Fileprop
{
 public static void main(String args[])throws IOException
 {
  String Fname = args[0];
  File f = new File(Fname);
  System.out.println("File name: "+f.getName());
  System.out.println("Path name: "+f.getPath());
  System.out.println("Absolute path: "+f.getAbsolutePath());
  System.out.println("Parent node: "+f.getParent());
  System.out.println("Exists: "+f.exists());
  if(f.exists())
  { 
   System.out.println("is Writable: "+f.canWrite());
   System.out.println("is readable: "+f.canRead());
   System.out.println("is Writable: "+f.isDirectory());
   System.out.println("File size in bytes: "+f.length());
  }
 }
}
