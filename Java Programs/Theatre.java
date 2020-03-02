class Mythread implements Runnable 
{
 String str;
 Mythread(String str)
 {
  this.str=str;
 }
  public void run()
  {
  for(int i=1;i<=10;i++)
  {
  System.out.println(str+":"+i);
  try
  {
  Thread.sleep(2000);
  }
  catch(InterruptedException ie)
  {
   ie.printStackTrace();
  }
 }
}
}
class Theatre
{
 public static void main(String args[])
 {
  Mythread mt=new Mythread("cut the ticket");
  Mythread mt1=new Mythread("Show the seat");
  Thread t1=new Thread(mt,"Suresh");
  Thread t2=new Thread(mt1,"Kumar");
  t1.start();
  t2.start();
 }
}
