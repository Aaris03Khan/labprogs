class Swap
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int temp;
  System.out.println("Before swapping a&b values: "+a+" "+b);
  temp = a;
  a = b;
  b = temp;
  System.out.println("Before swapping a&b values: "+a+" "+b);
 }
}
