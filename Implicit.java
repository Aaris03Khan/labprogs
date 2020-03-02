class Implicit
{
 public static void main(String args[])
 {
  int i=127;
  byte b;
  double d=323.143;
  System.out.println("Conversion of int into byte");
  b = (byte)i;
  System.out.println("The values of i:" +b);
  System.out.println("The conversion of double to int");
  i = (int)d;
  System.out.println("The value of i is: "+i);
  System.out.println("Conversion of double to byte");
  b = (byte)d;
  System.out.println("The value of b is :"+b);
 }
}
