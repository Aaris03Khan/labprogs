class Reserved implements Runnable
{
 int available = 1;
 int wanted;
 Reserved(int i)
 {
  wanted = i;
 }
 public void run()
 {
  System.out.println("Available berths:" +available);
  if(available>=wanted)
  { 
   String name = Thread.currentThread().getName();
   System.out.println(wanted+"berth reserve for"+name);
   try
   {
    Thread.sleep(1500);
    available = available-wanted;
   }
   catch(InterruptedException ie)
   {
    ie.printStackTrace();
   }
  }
  else
  System.out.println("Sorry!, No berths");
 }
}
class Unsafe
{
 public static void main(String args[])
 {
  Reserved r=new Reserved(1);
  Thread t1=new Thread(r,"Aaris");
  Thread t2=new Thread(r);
  t2.setName("Aaris");
  t1.start();
 }
}
