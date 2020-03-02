import java.util.*;
class Fiboscan
{
 public static void main(String args[])
 {
  Scanner Sc = new Scanner(System.in);
  System.out.println("Enter Number :");
  int n = Sc.nextInt();
  int i,t1 = 0,t2 = 1;
  int nextTerm;
  System.out.println("Fibonacci Series: ");  
  for (i = 1; i <= n; ++i)
  {
  System.out.println(" "+t1);
  nextTerm = t1 + t2;
  t1 = t2;
  t2 = nextTerm;
  }
 }
}
