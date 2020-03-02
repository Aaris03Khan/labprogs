import java.util.*;
class Factscan
{
 public static void main(String args[])
 {
  Scanner Sc = new Scanner(System.in);
  System.out.println("Enter a Number :");
  int n = Sc.nextInt();
  int i,fact = 1;
  if (n < 0)
  System.out.println("Error! Factorial of a negative number doesn't exist.");
  else 
  {
   for (i = 1; i <= n; ++i)
   {
    fact *= i;
   }
   System.out.println("Factorial of"+n+"="+fact);
  }
 }
}
