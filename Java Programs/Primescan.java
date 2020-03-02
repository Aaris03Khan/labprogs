import java.util.*;
class Primescan
{
 public static void main(String args[])
 {
  Scanner Sc = new Scanner(System.in);
  System.out.println("Enter a Number :");
  int n = Sc.nextInt();
  int i,c=0;
  for (i = 1; i <= n; i++) 
  {
      if (n % i == 0) 
      c++;
  }
  if (c == 2) 
  {
  System.out.println("n is a Prime number");
  }
  else
  { 
  System.out.println("n is not a Prime number");
  } 
 }
}
