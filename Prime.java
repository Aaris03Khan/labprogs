class Prime
{
 public static void main(String args[])
 {
  int n=10,i,c=0;
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
