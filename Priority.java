class Myclass extends Thread
{
 int count=0;
 public void run()
 {
  for(int i=0;i<=10;i++)
  count++;
  System.out.println("completed Thread: "+Thread.currentThread().getName());
  System.out.println("It's Priority: "+Thread.currentThread().getPriority());
 }
}
class Priority
{
 public static void main (String args[])
 {
  Myclass mc=new Myclass();
  Thread t1=new Thread(mc,"Aaris");
  Thread t2=new Thread(mc,"Khan");
  t1.setPriority(2);
  t1.setPriority(Thread.MAX_PRIORITY);
  t1.start();
  t2.start();
 }
}
