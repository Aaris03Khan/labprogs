class Explicit
{
 public static void main(String args[])
 {
  int i=0;
  byte b=127;
  double d=323.143;
  System.out.println("Conversion of byte into int: ");
  i = (int)b;
  System.out.println("The values of i:" +i);
  System.out.println("The conversion of int to double: ");
  d = (double)i;
  System.out.println("The value od d is: "+d);
  System.out.println("Conversion of byte to double :");
  d = (double)b;
  System.out.println("The value of d is :"+d);
 }
}
