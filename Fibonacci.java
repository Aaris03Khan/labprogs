class Fibonacci
{
 public static void main(String args[])
 {
  int i, n=10, t1 = 0, t2 = 1, nextTerm;
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
